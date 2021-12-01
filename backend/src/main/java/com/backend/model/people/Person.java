package com.backend.model.people;

import java.io.Serializable;
import java.util.List;

import com.backend.model.Birthday;
import com.backend.model.creatures.Pet;
import com.backend.model.items.Wand;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "blood_status")
    private String bloodStatus;

    @JsonIgnoreProperties(value="person")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "birthday_id", referencedColumnName = "id")
    private Birthday birthday;

    @JsonIgnoreProperties(value = "person")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wand_id", referencedColumnName = "id")
    private Wand wand;

    @Column(name = "patronus")
    private String patronus;

    @JsonIgnoreProperties(value = "person")
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private List<Pet> pets;

    public Person(String firstName, String lastName, String bloodStatus, Birthday birthday, Wand wand, String patronus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bloodStatus = bloodStatus;
        this.birthday = birthday;
        this.wand = wand;
        this.patronus = patronus;
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

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void removePet(Pet pet){
        pets.remove(pet);
    }
}
