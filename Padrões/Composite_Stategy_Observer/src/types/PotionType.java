package types;

public enum PotionType {

    HEALTH_POTION("Poção de Vida"),
    MANA_POTION("Poção de Mana");

    private final String displayName;

    PotionType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() { return displayName; }

}
