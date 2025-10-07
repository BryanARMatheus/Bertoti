package types;

public enum WeaponType {
    SWORD("Espada"),
    AXE("Machado"),
    BOW("Arco"),
    STAFF("Cajado"),
    DAGGER("Adaga");

    private String displayName;

    WeaponType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
