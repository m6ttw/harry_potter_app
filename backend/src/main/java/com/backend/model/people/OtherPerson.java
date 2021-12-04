package com.backend.model.people;

import com.backend.model.Birthday;
import com.backend.model.items.Wand;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "other_persons")
public class OtherPerson extends Person implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "occupation")
    private String occupation;

    public OtherPerson(String firstName, String lastName, String bloodStatus, Birthday birthday, String occupation, Wand wand, String patronus) {
        super(firstName, lastName, bloodStatus, birthday, wand, patronus);
        this.occupation = occupation;
    }

    public OtherPerson(){}

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
