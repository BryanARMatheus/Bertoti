package sort;

import interfaces.InventoryItem;
import interfaces.SortStrategy;

import java.util.Comparator;
import java.util.List;

public class ValueSort implements SortStrategy {
    @Override
    public void sort(List<InventoryItem> items) {
        items.sort(Comparator.comparing(InventoryItem::getValue).reversed());
    }
}
