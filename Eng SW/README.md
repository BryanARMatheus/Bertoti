# Engenharia-de-software
We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

A engenharia de software carrega um peso muito maior junto com diversos fatores que devem ser levados em conta, o tempo para realizar o projeto e a importancia de um codigo funcional se provam essenciais, pois a escala de um erro que pode levar milhares de clientes/usuarios perderem acesso ao software é monumental comparado a um erro que foi encontrado ao programar um projeto pessoal.

## Trade-offs na programação
### Consistencia e acessibilidade
No caso de um grande fluxo de dados o sacrificio da acessibilidade destes dados por uma consistencia para com os mesmos pode ocorrer, isto resulta em um erro caso um sistema não consiga garantir que os dados que estão sendo acessados são os mais recentes, enquanto um foco em acessibilidade resultaria no oposto.
### Velocidade e legibilidade do código
No desenvolvimento de software desenvolvedores podem escolher o caminho mais facil e rápido ao desenvolver seus códigos, contudo futuramente quando se prova necessário uma alteração/manutenção no programa até mesmo os desenvolvedores podem ter serios problemas para entender as funcionalidades do codigo, especialmente sem a documentação adequada.
### Funções e linguagens específicas
É possível reparar que algumas linguagens possuem uma melhor compatibilidade com funções específicas, por exemplo: Python com desenvolvimento de formulas matematicas, Engines de jogos como GameMaker e Unity no desenvolvimento de jogos, não que o desenvolvimentos de jogos seja impossivel no Python, mas a quantidade de funções e recursos da linguagem para fazer um jogo é muito menor que o que o GameMaker oferece.

## Código utilizando lista com testes em JUnit
package saladeaula;

### Classe do objeto navio
```java
public class Navio {
	
	//Variaveis
	private String nome;
	private String afiliação;
	private int anoConstrução;
	
	//Criação do construtor
	public Navio(String nome, String afiliação, int anoConstrução) {
		this.nome = nome;
		this.afiliação = afiliação;
		this.anoConstrução = anoConstrução;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public String getAfiliação() {
		return afiliação;
	}
	
	public int getAnoConstrução() {
		return anoConstrução;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAfiliação(String afiliação) {
		this.afiliação = afiliação;
	}

	public void setAnoConstrução(int anoConstrução) {
		this.anoConstrução = anoConstrução;
	}
	
}
```
### Classe do porto naval
```java
package saladeaula;
import java.util.LinkedList;
import java.util.List;

public class PortoNaval {
	
	//Cria uma linked list que contem os navios estacionados no porto 
	private List<Navio> naviosNoPorto = new LinkedList<Navio>();
	
	//Método utilizado para admitir um novo navio no porto
	public void admitirNovoNavio (Navio navio) {
		naviosNoPorto.add(navio);
	}
	
	// Método que busca na lista de navios a partir do nome do navio 
	public List<Navio> buscarPorNome (String nome){
		List<Navio> naviosEncontrados = new LinkedList<Navio>(); //Cria uma nova lista com base no resultado de navios encontrados
		
		// Verifica da classe *Navio* os objetos *navio* que estão presentes na lista de navios do porto *naviosNoPorto* 
		for (Navio navio:naviosNoPorto) {
			if (navio.getNome().equals(nome)) {
				naviosEncontrados.add(navio);
				}
			}
		
		// Retorna a lista de navios encontrados
		return naviosEncontrados;
	}
	
	// Método para adquirir todos os navios presentes no porto
	public List<Navio> getNavios(){
		return naviosNoPorto;
	}
	
}
```
### Casos de teste utilizando o JUnit
```java
package saladeaula;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestePortoNaval {
	
	//Método para realizar testes
	@Test
	void test() {
		//Instância-se a classe PortoNaval
		PortoNaval pontoNaval = new PortoNaval();
		
		//Cria seis objetos da classe Navio
		Navio implacable = new Navio("Implacable", "HMS", 1800);
		Navio dukeOfYork = new Navio("Duke of York", "HMS", 1940);
		Navio enterprise = new Navio("Enterprise", "USS", 1936);
		Navio newJersey = new Navio("New Jersey", "USS", 1942);
		Navio tirpitz = new Navio("Tirpitz", "KMS", 1939);
		Navio deutschland = new Navio("Deutschland", "KMS", 1931);
		
		//Cadastra os navios criados no porto
		pontoNaval.admitirNovoNavio(implacable);
		pontoNaval.admitirNovoNavio(dukeOfYork);
		pontoNaval.admitirNovoNavio(enterprise);
		pontoNaval.admitirNovoNavio(newJersey);
		pontoNaval.admitirNovoNavio(tirpitz);
		pontoNaval.admitirNovoNavio(deutschland);
		
		//Vefifica a quantidade de navios no porto, se a quantidade for 6 o teste resulta em sucesso
		Assert.assertEquals(pontoNaval.getNavios().size(), 6);
		
		//utiliza o método de busca por nome nos navios do porto em busca do navio "Deutschland"
		List<Navio> encontrarDeutschland = pontoNaval.buscarPorNome("Deutschland");
		assertEquals(encontrarDeutschland.get(0).getNome(), deutschland.getNome());
		//Se o navio for encontrado no porto que possua este nome o resultado do teste resulta em sucesso
		
	}

}
```
## UML das classes utilizadas no teste JUNIT

![UMLCLasses](https://github.com/user-attachments/assets/29086d81-f683-400b-9822-fed65081ead4)
