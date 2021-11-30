package com.backend.models.people;

import java.util.ArrayList;

import com.backend.models.Birthday;
import com.backend.models.creatures.Creature;
import com.backend.models.items.Wand;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String firstName;
    private String lastName;
    private String bloodStatus;
    private Birthday birthday;
    private Wand wand;
    private String patronus;
    private ArrayList<Creature> pets;

    public Person(String firstName, String lastName, String bloodStatus, Birthday birthday, Wand wand, String patronus) {
        this.firstName = firstName;
        this.bloodStatus = bloodStatus;
        this.birthday = birthday;
        this.wand = wand;
        this.patronus = patronus;
        this.pets = new ArrayList<>();
    }

    public Person(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }

    public void setBloodStatus(String bloodStatus) {
        this.bloodStatus = bloodStatus;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
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

    public void addPet(Creature pet){
        pets.add(pet);
    }

    public void removePet(Creature pet){
        pets.remove(pet);
    }
}
