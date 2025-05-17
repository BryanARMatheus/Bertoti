package com.springboots.Springboots;

public class Ship {

    private final String id;
    private String name;
    private String faction;
    private String constructionDate;

    public Ship(String id, String name, String faction, String constructionDate) {
        this.id = id;
        this.name = name;
        this.faction = faction;
        this.constructionDate = constructionDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFaction() { return faction; }

    public void setFaction(String faction) { this.faction = faction; }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(String constructionDate) {
        this.constructionDate = constructionDate;
    }
}
