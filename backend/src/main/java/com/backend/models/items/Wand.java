package com.backend.models.items;

public class Wand {

    private String core;
    private String wood;
    private double length;

    public Wand(String core, String wood, double length) {
        this.core = core;
        this.wood = wood;
        this.length = length;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
