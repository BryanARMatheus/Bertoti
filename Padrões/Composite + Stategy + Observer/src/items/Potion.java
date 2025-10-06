package src.items;

import src.interfaces.InventoryItem;
import src.types.PotionType;

public class Potion implements InventoryItem {
    private String name;
    private int weight;
    private int value;
    private int recoverAmount;
    private PotionType potionType;

    public void use(Character character) {
        if (potionType.equals(PotionType.MANA_POTION)){
            System.out.println("Você recuperou: " + recoverAmount + "de MP");
            return;
        }

        System.out.println("Você recuperou: " + recoverAmount + "de HP");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getValue() {
        return value;
    }

}
