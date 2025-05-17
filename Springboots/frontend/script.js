const refreshButton = document.getElementById("refresh-button");
const createButton = document.getElementById("create-button");
const editButton = document.getElementById("edit-button");
const deleteButton = document.getElementById("delete-button");

const shipList = document.getElementById("list-ships")
const createTab = document.getElementById("create-ships");
const editTab = document.getElementById("edit-ships");
const deleteTab = document.getElementById("delete-ships");

const createName = document.getElementById("create-name");
const createFaction = document.getElementById("create-faction");
const createConstruction = document.getElementById("create-construction");
const createSubmit = document.getElementById("create-submit");

const editSelect = document.getElementById("edit-select");
const editName = document.getElementById("edit-name");
const editFaction = document.getElementById("edit-faction");
const editConstruction = document.getElementById("edit-construction");
const editSubmit = document.getElementById("edit-submit");

const deleteSelect = document.getElementById("delete-select");
const deleteSubmit = document.getElementById("delete-submit");

let ships = [];
let lastId = 0;

function getNextId() {
    if (ships.length > 0) {
        const ids = ships.map(ship => parseInt(ship.id)).filter(id => !isNaN(id));
        lastId = Math.max(...ids, lastId);
    }
    return (++lastId).toString();
}

document.addEventListener('DOMContentLoaded', async () => {
    showTab('list');
    await listShips();
    await populateEditSelect();
    await populateDeleteSelect();
    
    createButton.addEventListener("click", populateEditSelect);
    editButton.addEventListener("click", populateEditSelect);
    deleteButton.addEventListener("click", populateDeleteSelect);
});

const tabs = {
    list: document.getElementById("list-ships"),
    create: document.getElementById("create-ships"),
    edit: document.getElementById("edit-ships"),
    delete: document.getElementById("delete-ships")
};

function showTab(tabId) {


 if (!tabs[tabId]) {
        console.error(`Tab ${tabId} não encontrada`);
        return;
  }

    Object.values(tabs).forEach(tab => {
        if (tab) tab.style.display = "none";
    });


    tabs[tabId].style.display = "block";
}

refreshButton.addEventListener("click", async function() {
    await listShips();
    showTab('list');
});

createButton.addEventListener("click", function() {
    showTab('create');
});

editButton.addEventListener("click", function() {
    showTab('edit');
});

deleteButton.addEventListener("click", function() {
    showTab('delete');
});


async function listShips() {
    const response = await fetch("http://localhost:8080/ships",  {
      mode: 'cors',
      headers: {
        'Content-Type': 'application/json',
      }
    })
    ships = await response.json()

    const shipItems = document.querySelectorAll('.ship-item');
    shipItems.forEach(item => item.remove());

    try {
    ships.forEach((ship) => {
        const newItem = document.createElement("div")
        newItem.classList.add("ship-item")

        const infos = document.createElement("div")

        infos.classList.add("ship-info")
        infos.innerHTML = `
        <span>${ship.id}</span>
        <span>Nome: ${ship.name}</span>
        <span>Facção: ${ship.faction}</span>
        <span>Ano de Construção: ${ship.constructionDate}</span>
        `

        newItem.appendChild(infos)
        shipList.appendChild(newItem)
    })
     } catch (error) {
    console.error("Erro ao fazer a requisição:", error);
  }
}

async function createShip() {
    const name = document.getElementById("create-name").value;
    const faction = document.getElementById("create-faction").value;
    const constructionDate = document.getElementById("create-construction").value;

    try {
        const id = getNextId();

        const response = await fetch("http://localhost:8080/ships", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                id: id,
                name: name,
                faction: faction,
                constructionDate: constructionDate
            })
        });

        if (!response.ok) {
            throw new Error("Erro ao criar navio");
        }

        document.getElementById("create-name").value = "";
        document.getElementById("create-faction").value = "";
        document.getElementById("create-construction").value = "";

        await listShips();
        showTab('list');
        alert("Navio criado com sucesso!");
    } catch (error) {
        console.error("Erro:", error);
        alert("Falha ao criar navio");
    }
}

createSubmit.addEventListener("click", createShip);

async function populateEditSelect() {
    editSelect.innerHTML = "";
    await listShips();
    
    ships.forEach(ship => {
        const option = document.createElement("option");
        option.value = ship.id;
        option.textContent = `${ship.name} (ID: ${ship.id})`;
        editSelect.appendChild(option);
    });
}

editSelect.addEventListener("change", async function() {
    const shipId = this.value;
    const ship = ships.find(s => s.id == shipId);
    
    if (ship) {
        document.getElementById("edit-name").value = ship.name;
        document.getElementById("edit-faction").value = ship.faction;
        document.getElementById("edit-construction").value = ship.constructionDate;
    }
});

async function editShip() {
    const shipId = editSelect.value;
    const name = document.getElementById("edit-name").value;
    const faction = document.getElementById("edit-faction").value;
    const constructionDate = document.getElementById("edit-construction").value;

    try {
        const response = await fetch(`http://localhost:8080/ships/${shipId}`, {
            method: "PUT",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                id: shipId,
                name: name,
                faction: faction,
                constructionDate: constructionDate
            })
        });

        if (!response.ok) {
            throw new Error("Erro ao editar navio");
        }

        document.getElementById("edit-name").value = "";
        document.getElementById("edit-faction").value = "";
        document.getElementById("edit-construction").value = "";

        await listShips();
        showTab('list');
        alert("Navio editado com sucesso!");
    } catch (error) {
        console.error("Erro:", error);
        alert("Falha ao editar navio");
    }
}

editSubmit.addEventListener("click", editShip);


async function populateDeleteSelect() {
    deleteSelect.innerHTML = "";
    await listShips();
    
    ships.forEach(ship => {
        const option = document.createElement("option");
        option.value = ship.id;
        option.textContent = `${ship.name} (ID: ${ship.id})`;
        deleteSelect.appendChild(option);
    });
}

async function deleteShip() {
    const id = deleteSelect.value;

     if (!id) {
        alert("Selecione um navio para deletar");
        return;
    }

    if (!confirm(`Tem certeza que deseja deletar o navio ID ${id}?`)) {
        return;
    }

    try {
        const response = await fetch(`http://localhost:8080/ships/${id}`, {
            method: "DELETE"
        });

        if (!response.ok) {
            throw new Error("Erro ao deletar navio");
        }

       
        await listShips();
        await populateDeleteSelect();
        showTab('list');
        alert("Navio deletado com sucesso!");
    } catch (error) {
        console.error("Erro:", error);
        alert("Falha ao deletar navio");
    }
}

deleteSubmit.addEventListener("click", deleteShip);

refreshButton.addEventListener("click", async function () {
  await listShips();
});