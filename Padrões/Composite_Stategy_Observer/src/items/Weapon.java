package items;

import interfaces.InventoryItem;
import types.WeaponType;

public class Weapon implements InventoryItem {
    private String name;
    private int weight;
    private int value;
    private int damage;
    private WeaponType weaponType;

    public Weapon(String name, int weight, int value, int damage, WeaponType weaponType) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.damage = damage;
        this.weaponType = weaponType;
    }

    @Override
    public void use() {
        System.out.println("Você equipou: " + weaponType.getDisplayName() +
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
