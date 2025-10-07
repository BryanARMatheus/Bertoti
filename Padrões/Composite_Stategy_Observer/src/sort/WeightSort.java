package sort;

import interfaces.SortStrategy;
import interfaces.InventoryItem;

import java.util.Comparator;
import java.util.List;

public class WeightSort implements SortStrategy {
    @Override
    public void sort(List<InventoryItem> items) {
        items.sort(Comparator.comparing(InventoryItem::getWeight));
    }
}
