package com.backend.model;

import com.backend.model.people.Person;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "birthday")
public class Birthday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "birthday")
    private LocalDate birthday;

    @OneToOne(mappedBy = "birthday")
    private Person person;

    public Birthday(int year, int month, int day) {
        this.birthday = LocalDate.of(year, month, day);
    }

    public Birthday(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
