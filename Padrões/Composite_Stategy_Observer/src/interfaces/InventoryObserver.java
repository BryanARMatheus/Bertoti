package interfaces;

import eventhandlers.InventoryEvent;

public interface InventoryObserver {
    void onInventoryEvent(InventoryEvent event);
}
