package com.backend.models.people;

import com.backend.models.items.Book;
import com.backend.models.items.Wand;

import java.util.ArrayList;

public class Pupil extends Person {

    private String house;
    private ArrayList<Book> books;

    public Pupil(String name, String bloodStatus, int year, int month, int day, String house, Wand wand, String patronus) {
        super(name, bloodStatus, year, month, day, wand, patronus);
        this.house = house;
        this.books = new ArrayList<>();
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
