package com.backend.model.people;

import com.backend.model.Birthday;
import com.backend.model.items.Wand;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "teachers")
public class Teacher extends Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "subject")
    private String subject;

    public Teacher(String firstName, String lastName, String bloodStatus, Birthday birthday, String subject, Wand wand, String patronus) {
        super(firstName, lastName, bloodStatus, birthday, wand, patronus);
        this.subject = subject;
    }

    public Teacher(){}

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}