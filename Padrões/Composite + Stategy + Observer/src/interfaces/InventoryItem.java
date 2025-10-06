package src.interfaces;

public interface InventoryItem {
    String getName();
    int getWeight();
    int getValue();
    void use(Character character);
}
