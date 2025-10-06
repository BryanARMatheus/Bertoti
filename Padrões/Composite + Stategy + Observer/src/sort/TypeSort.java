package src.sort;

import src.interfaces.InventoryItem;

import java.util.Comparator;
import java.util.List;

public class TypeSort implements SortStategy{
    @Override
    public void sort(List<InventoryItem> items) {
        items.sort(Comparator.comparing(InventoryItem::getWeight));
    }
}
