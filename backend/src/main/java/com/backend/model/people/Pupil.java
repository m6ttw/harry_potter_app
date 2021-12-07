package com.backend.model.people;

import com.backend.model.Birthday;
import com.backend.model.items.Book;
import com.backend.model.items.Wand;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pupils")
public class Pupil extends Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "house")
    private String house;

    @JsonIgnoreProperties(value = "pupil")
    @OneToMany(mappedBy = "pupil", fetch = FetchType.LAZY)
    private List<Book> books;

    public Pupil(String firstName, String lastName, String bloodStatus, Birthday birthday, String house, Wand wand, String patronus) {
        super(firstName, lastName, bloodStatus, birthday, wand, patronus);
        this.house = house;
        this.books = new ArrayList<>();
    }

    public Pupil(){}

//    @JsonIgnore
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.add(book);
    }
}
