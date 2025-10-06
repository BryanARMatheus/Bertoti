package eventhandlers;

public class InventoryEvent {

    private EventType EventType;
    private inventoryItem item;
    private InventoryContainer inventory;

    public InventoryEvent(eventhandlers.EventType eventType, inventoryItem item, InventoryContainer inventory) {
        EventType = eventType;
        this.item = item;
        this.inventory = inventory;
    }
    public EventType getEventType() {
        return EventType;
    }
    public inventoryItem getItem() {
        return item;
    }
    public InventoryContainer getInventory() {
        return inventory;
    }

    
}