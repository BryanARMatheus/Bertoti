import eventhandlers.InventoryContainer;
import eventhandlers.PlayerInventory;
import items.Armor;
import items.Potion;
import items.Weapon;
import sort.ValueSort;
import sort.WeightSort;
import types.ArmorType;
import types.PotionType;
import types.WeaponType;

public class Main {
    public static void main(String[] args) {
        PlayerInventory inventory = new PlayerInventory(100);
        
        Weapon sword1 = new Weapon("Espada de ferro", 5, 50, 15, WeaponType.SWORD);
        Armor shield1 = new Armor("Escudo de ferro", 8, 30, 10, ArmorType.SHIELD);
        Potion healthPotion1 = new Potion("Poção de vida", 1, 10, 25, PotionType.HEALTH_POTION);
        
        inventory.addItem(sword1);
        inventory.useItem(sword1);
        inventory.addItem(shield1);
        inventory.useItem(shield1);
        inventory.addItem(healthPotion1);
        inventory.useItem(healthPotion1);
        
        inventory.setSortStrategy(new WeightSort());
        inventory.printInventory();

        inventory.setSortStrategy(new ValueSort());
        inventory.printInventory();
        
        InventoryContainer treasureChest = new InventoryContainer("Treasure Chest", 100);
        treasureChest.addItem(new Weapon("Adaga de ouro", 2, 200, 5, WeaponType.DAGGER));

        inventory.useItem(healthPotion1);
    }
    
}