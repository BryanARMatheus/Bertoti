package src.items;

import src.interfaces.InventoryItem;
import src.types.WeaponType;

public class Weapon implements InventoryItem {
    private String name;
    private int weight;
    private int value;
    private int damage;
    private WeaponType weaponType;

    @Override
    public void use(Character character) {
        System.out.println("Você equipou uma: " + weaponType +
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

    public int getDamage() {
        return damage;
    }

}
