package src.items;

import src.interfaces.InventoryItem;
import src.types.ArmorType;

public class Armor implements InventoryItem{
    private String name;
    private int weight;
    private int value;
    private int defense;
    private ArmorType armorType;

    @Override
    public void use(Character character) {
        System.out.println("Você equipou uma: " + armorType +
                "\n Nome: " + name);
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

    public int getDefense() {
        return defense;
    }

}