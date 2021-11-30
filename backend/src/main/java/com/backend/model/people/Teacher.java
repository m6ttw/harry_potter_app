package com.backend.model.people;

import com.backend.model.Birthday;
import com.backend.model.items.Wand;

public class Teacher extends Person {

    private String subject;

    public Teacher(String firstName, String lastName, String bloodStatus, Birthday birthday, String subject, Wand wand, String patronus) {
        super(firstName, lastName, bloodStatus, birthday, wand, patronus);
        this.subject = subject;
    }

    public Teacher(){}

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
