import java.util.ArrayList;
import java.util.List;

import src.interfaces.InventoryItem;

public class PlayerInventory {
    private InventoryContainer mainBag;
    private List<InventoryObserver> observers = new ArrayList<>();
    private InventorySortStrategy currentSortStrategy;
    private int maxWeight;
    
    public PlayerInventory(int maxWeight) {
        this.mainBag = new InventoryContainer("Main Bag");
        this.maxWeight = maxWeight;
        this.currentSortStrategy = new TypeSortStrategy();
    }
    
    public void addObserver(InventoryObserver observer) {
        observers.add(observer);
    }
    
    private void notifyObservers(InventoryEvent event) {
        observers.forEach(observer -> observer.onInventoryEvent(event));
    }
    
    public boolean addItem(InventoryItem item) {
        if (getTotalWeight() + item.getWeight() > maxWeight) {
            return false;
        }
        
        mainBag.addItem(item);
        notifyObservers(new InventoryEvent(
            InventoryEvent.Type.ITEM_ADDED, item, mainBag
        ));
        return true;
    }
    
    public void useItem(InventoryItem item, Character character) {
        item.use(character);
        notifyObservers(new InventoryEvent(
            InventoryEvent.Type.ITEM_USED, item, mainBag
        ));
    }
    
    public void setSortStrategy(InventorySortStrategy strategy) {
        this.currentSortStrategy = strategy;
        currentSortStrategy.sort(mainBag.getItems());
    }
    
    public int getTotalWeight() {
        return mainBag.getWeight();
    }
}
