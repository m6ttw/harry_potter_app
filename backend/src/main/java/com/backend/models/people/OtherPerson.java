package com.backend.models.people;

import com.backend.models.items.Wand;

public class OtherPerson extends Person
{

    private String occupation;

    public OtherPerson(String name, String species, String bloodStatus, int year, int month, int day, String occupation, Wand wand, String patronus) {
        super(name, species, bloodStatus, year, month, day, wand, patronus);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
