package com.backend.models.people;

import com.backend.models.Birthday;
import com.backend.models.items.Book;
import com.backend.models.items.Wand;

import java.util.ArrayList;

public class Pupil extends Person {

    private String house;
    private ArrayList<Book> books;

    public Pupil(String firstName, String lastName, String bloodStatus, Birthday birthday, String house, Wand wand, String patronus) {
        super(firstName, lastName, bloodStatus, birthday, wand, patronus);
        this.house = house;
        this.books = new ArrayList<>();
    }

    public Pupil(){}

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

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }
}
