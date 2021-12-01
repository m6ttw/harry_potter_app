package com.backend.model.creatures;

public class WildCreature {

    private String name;
    private String species;

    public WildCreature(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public WildCreature(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
