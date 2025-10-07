package items;

import interfaces.InventoryItem;
import types.ArmorType;

public class Armor implements InventoryItem{
    private String name;
    private int weight;
    private int value;
    private int defense;
    private ArmorType armorType;

    @Override
    public void use() {
        System.out.println("Você equipou: " + armorType.getDisplayName() +
                "\n Nome: " + name);
    }

    public Armor(String name, int weight, int value, int defense, ArmorType armorType) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.defense = defense;
        this.armorType = armorType;
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