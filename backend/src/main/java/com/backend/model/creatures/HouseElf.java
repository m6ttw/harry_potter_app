package com.backend.model.creatures;

public class HouseElf {

    private String name;
    private String family;
    private boolean isFree;

    public HouseElf(String name, String family, boolean isFree) {
        this.name = name;
        this.family = family;
        this.isFree = isFree;
    }

    public HouseElf(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
