package eventhandlers;

import interfaces.InventoryItem;
import types.EventType;

public class InventoryEvent {

    private EventType eventType;
    private InventoryItem item;
    private InventoryContainer inventory;

    public InventoryEvent(EventType eventType, InventoryItem item, InventoryContainer inventory) {
        this.eventType = eventType;
        this.item = item;
        this.inventory = inventory;
    }

    public EventType getEventType() {
        return eventType;
    }
    public InventoryItem getItem() {
        return item;
    }
    public InventoryContainer getInventory() {
        return inventory;
    }

    
}