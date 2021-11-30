package com.backend.models;

import java.time.LocalDate;

public class Birthday {

    private LocalDate birthday;

    public Birthday(int year, int month, int day) {
        this.birthday = LocalDate.of(year, month, day);
    }
}
