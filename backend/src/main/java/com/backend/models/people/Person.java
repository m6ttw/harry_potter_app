package com.backend.models.people;

import java.time.LocalDate;
import java.util.ArrayList;

import com.backend.models.creatures.Creature;
import com.backend.models.items.Wand;

public class Person {

    private String name;
    private String bloodStatus;
    private LocalDate birthday;
    private Wand wand;
    private String patronus;
    private ArrayList<Creature> pets;

    public Person(String name, String bloodStatus, int year, int month, int day, Wand wand, String patronus) {
        this.name = name;
        this.bloodStatus = bloodStatus;
        this.birthday = LocalDate.of(year, month, day);
        this.wand = wand;
        this.patronus = patronus;
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<Creature> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Creature> pets) {
        this.pets = pets;
    }


}
