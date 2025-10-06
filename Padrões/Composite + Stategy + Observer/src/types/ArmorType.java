package src.types;

public enum ArmorType {
    HELMET("Capacete"),
    CHEST_ARMOR("Armadura de Torso"),
    LEG_ARMOR("Armadura de Pernas"),
    BOOTS("Botas"),
    SHIELD("Escudo"),
    ;

    private String displayName;


    ArmorType(String displayName) {
        this.displayName = displayName;
    }
}
