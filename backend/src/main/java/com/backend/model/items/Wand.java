package com.backend.model.items;

import com.backend.model.people.Person;

import javax.persistence.*;

@Entity
@Table(name = "wand")
public class Wand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "core")
    private String core;

    @Column(name = "wood")
    private String wood;

    @Column(name = "length")
    private double length;

    @OneToOne(mappedBy = "wand")
    private Person person;

    public Wand(String core, String wood, double length) {
        this.core = core;
        this.wood = wood;
        this.length = length;
    }

    public Wand(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
