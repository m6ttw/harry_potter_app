package com.backend.model.people;

import java.util.ArrayList;

import com.backend.model.Birthday;
import com.backend.model.creatures.Creature;
import com.backend.model.items.Wand;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "blood_status")
    private String bloodStatus;

    @Column(name = "birthday")
    private Birthday birthday;

    @Column(name = "wand")
    private Wand wand;

    @Column(name = "patronus")
    private String patronus;

    @Column(name = "pets")
    private ArrayList<Creature> pets;

    public Person(String firstName, String lastName, String bloodStatus, Birthday birthday, Wand wand, String patronus) {
        this.firstName = firstName;
        this.lastName = lastName;
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
