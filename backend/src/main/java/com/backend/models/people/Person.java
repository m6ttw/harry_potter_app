package com.backend.models.people;

import java.time.LocalDate;

import com.backend.models.items.Wand;

public class Person {

    private String name;
    private String species;
    private String bloodStatus;
    private LocalDate birthday;
    private Wand wand;
    private String patronus;

    public Person(String name, String species, String bloodStatus, int year, int month, int day, Wand wand, String patronus) {
        this.name = name;
        this.species = species;
        this.bloodStatus = bloodStatus;
        this.birthday = LocalDate.of(year, month, day);
        this.wand = wand;
        this.patronus = patronus;
    }

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

    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }
}
