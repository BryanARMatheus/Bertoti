import src.types.ArmorType;

public class Main {
    public static void main(String[] args) {
        PlayerInventory inventory = new PlayerInventory(100);
        
        inventory.addObserver(new UIInventoryDisplay());
        inventory.addObserver(new AchievementSystem());
        inventory.addObserver(new SoundSystem());
        
        Weapon sword1 = new Weapon("Espada de ferro", 5, 50, 15, WeaponType.SWORD);
        Armor shield1 = new Armor("Escudo de ferro", 8, 30, 10, ArmorType.SHIELD);
        Potion healthPotion1 = new Potion("Poção de vida", 1, 10, 25);
        
        inventory.addItem(sword1);
        inventory.addItem(shield1);
        inventory.addItem(healthPotion1);
        
        inventory.setSortStrategy(new WeightSortStrategy());
        inventory.setSortStrategy(new ValueSortStrategy());
        
        InventoryContainer treasureChest = new InventoryContainer("Treasure Chest");
        treasureChest.addItem(new Weapon("Adaga de ouro", 2, 200, 5, WeaponType.DAGGER));
        inventory.addItem(treasureChest);
        
        Character player = new Character();
        inventory.useItem(healthPotion, player);
    }
    
}