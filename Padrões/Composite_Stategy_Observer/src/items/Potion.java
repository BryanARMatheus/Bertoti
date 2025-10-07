package items;

import interfaces.InventoryItem;
import types.PotionType;

public class Potion implements InventoryItem {
    private String name;
    private int weight;
    private int value;
    private int recoverAmount;
    private PotionType potionType;

    public Potion(String name, int weight, int value, int recoverAmount, PotionType potionType) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.recoverAmount = recoverAmount;
        this.potionType = potionType;
    }

    public void use() {
        if (potionType.equals(PotionType.MANA_POTION)){
            System.out.println("Você recuperou: " + recoverAmount + " de MP");
            return;
        }

        System.out.println("Você recuperou: " + recoverAmount + " de HP");
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
