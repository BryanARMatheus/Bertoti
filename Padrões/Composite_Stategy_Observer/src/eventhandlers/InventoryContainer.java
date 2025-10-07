package eventhandlers;

import java.util.ArrayList;
import java.util.List;

import interfaces.InventoryItem;

public class InventoryContainer {
    private String name;
    private List<InventoryItem> items = new ArrayList<>();
    private int containerWeight;

    public InventoryContainer(String name, int containerWeight) {
        this.name = name;
        this.containerWeight = containerWeight;
    }

    public void addItem(InventoryItem item) {
        items.add(item);
    }
    
    public void removeItem(InventoryItem item) {
        items.remove(item);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return containerWeight + items.stream().mapToInt(InventoryItem::getWeight).sum();
    }
    
    public int getValue() {
        return items.stream().mapToInt(InventoryItem::getValue).sum();
    }

    public List<InventoryItem> getItems() { return items; }
}
