package com.backend.models.people;

import com.backend.models.Birthday;
import com.backend.models.items.Wand;

import javax.print.attribute.standard.MediaSize;

public class OtherPerson extends Person
{

    private String occupation;

    public OtherPerson(String firstName, String lastName, String bloodStatus, Birthday birthday, String occupation, Wand wand, String patronus) {
        super(firstName, lastName, bloodStatus, birthday, wand, patronus);
        this.occupation = occupation;
    }

    public OtherPerson(){}

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
