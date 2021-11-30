package com.backend.tests;

import com.backend.models.Birthday;
import com.backend.models.items.Book;
import com.backend.models.items.Wand;
import com.backend.models.people.Pupil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PupilTest {

    Wand harryWand;
    Birthday harryBirthday;
    Pupil harryPotter;
    Book hogwartsAHistory;
    Book historyOfMagic;

    @Before
    public void setUp(){
        harryWand = new Wand("phoenix feather", "holly", 11.00);
        harryBirthday = new Birthday(1980, 07, 31);
        harryPotter = new Pupil("Harry", "Potter", "half-blood", harryBirthday, "Gryffindor", harryWand, "stag");
        hogwartsAHistory = new Book("Hogwarts: A History", "Bathilda Bagshot");
        historyOfMagic = new Book("A History of Magic", "Bathilda Bagshot");
    }

    @Test
    public void canGetWandCore(){
        assertEquals("phoenix feather", harryPotter.getWand().getCore());
    }
    
    @Test
    public void canAddBook(){
        harryPotter.getBooks().add(hogwartsAHistory);
        harryPotter.getBooks().add(historyOfMagic);
        assertEquals(2, harryPotter.getBooks().size());
    }
}
