package eventhandlers;

import java.util.ArrayList;
import java.util.List;

import interfaces.InventoryItem;
import interfaces.InventoryObserver;
import eventhandlers.InventoryEvent;
import interfaces.SortStrategy;
import types.EventType;

public class PlayerInventory {
    private InventoryContainer mainBag;
    private List<InventoryObserver> observers = new ArrayList<>();
    private SortStrategy currentSortStrategy;
    private int maxWeight;
    
    public PlayerInventory(int maxWeight) {
        this.mainBag = new InventoryContainer("Main Bag", 10);
        this.maxWeight = maxWeight;
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
            EventType.ITEM_ADDED, item, mainBag
        ));
        return true;
    }
    
    public void useItem(InventoryItem item) {
        item.use();
        notifyObservers(new InventoryEvent(
                EventType.ITEM_USED, item, mainBag
        ));
    }
    
    public void setSortStrategy(SortStrategy strategy) {
        this.currentSortStrategy = strategy;
        currentSortStrategy.sort(mainBag.getItems());
    }
    
    public int getTotalWeight() {
        return mainBag.getWeight();
    }

    public void printInventory() {
        System.out.println("=== " + mainBag.getName() + " ===");
        System.out.println("Total Weight: " + getTotalWeight() + "/" + maxWeight);
        System.out.println("Total Value: " + mainBag.getValue());
        System.out.println("Items (" + mainBag.getItems().size() + "):");

        if (mainBag.getItems().isEmpty()) {
            System.out.println("  (Empty)");
        } else {
            for (int i = 0; i < mainBag.getItems().size(); i++) {
                InventoryItem item = mainBag.getItems().get(i);
                System.out.printf("  %d. %s (Weight: %d, Value: %d)%n",
                        i + 1, item.getName(), item.getWeight(), item.getValue());
            }
        }
        System.out.println("======================");
    }

    public void sortAndPrintInventory(SortStrategy strategy) {
        setSortStrategy(strategy);
        System.out.println("Inventory sorted by: " + strategy.getClass().getSimpleName());
        printInventory();
    }
}
