package src.sort;

import src.interfaces.InventoryItem;

import java.util.List;

public interface SortStategy {
    void sort(List<InventoryItem> items);
}
