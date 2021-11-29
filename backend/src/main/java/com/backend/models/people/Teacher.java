package com.backend.models.people;

import com.backend.models.items.Wand;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, String species, String bloodStatus, int year, int month, int day, String subject, Wand wand, String patronus) {
        super(name, species,bloodStatus, year, month, day, wand, patronus);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
