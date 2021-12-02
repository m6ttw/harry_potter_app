package com.backend.components;

import com.backend.model.Birthday;
import com.backend.model.creatures.Creature;
import com.backend.model.items.Book;
import com.backend.model.items.Wand;
import com.backend.model.people.Pupil;
import com.backend.model.people.Teacher;
import com.backend.repository.BookRepository;
import com.backend.repository.CreatureRepository;
import com.backend.repository.PupilRepository;
import com.backend.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PupilRepository pupilRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    CreatureRepository creatureRepository;

    @Autowired
    BookRepository bookRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        Pupil harryPotter = new Pupil("Harry", "Potter", "half-blood", new Birthday(1980, 7, 31), "Gryffindor",
                new Wand("phoenix feather", "holly", 11.00), "stag");
        pupilRepository.save(harryPotter);

        Pupil hermioneGrainger = new Pupil("Hermione", "Grainger", "muggle-born", new Birthday(1979, 9, 19), "Gryffindor", new Wand("dragon heartstring", "vine wood", 10.75), "otter");
        pupilRepository.save(hermioneGrainger);

        Pupil ronWeasley = new Pupil("Ronald", "Weasley", "pure-blood", new Birthday(1980, 3, 1), "Gryffindor", new Wand("unicorn hair", "ash", 12.00), "jack russell");
        pupilRepository.save(ronWeasley);

        Teacher albusDumbledore = new Teacher("Albus", "Dumbledore", "half-blood", new Birthday(1881, 8, 27), "headmaster", new Wand("thestral hair", "elder", 15.00), "phoenix");
        teacherRepository.save(albusDumbledore);

        Teacher minervaMcGonagall = new Teacher("Minerva", "McGonagall", "half-blood", new Birthday(1900, 5, 3), "transfiguration", new Wand("", "", 18), "");
        teacherRepository.save(minervaMcGonagall);

        Creature hedwig = new Creature("Hedwig", "owl", harryPotter);
        creatureRepository.save(hedwig);
        Creature crookshanks = new Creature("Crookshanks", "cat", hermioneGrainger);
        creatureRepository.save(crookshanks);
        Creature scabbers = new Creature("Scabbers", "rat", ronWeasley);
        creatureRepository.save(scabbers);

        harryPotter.addPet(hedwig);
        pupilRepository.save(harryPotter);
        hermioneGrainger.addPet(crookshanks);
        pupilRepository.save(hermioneGrainger);
        ronWeasley.addPet(scabbers);
        pupilRepository.save(ronWeasley);

        Book historyOfMagic = new Book("A History of Magic", "Bathilda Bagshot", hermioneGrainger);
        bookRepository.save(historyOfMagic);
        hermioneGrainger.addBook(historyOfMagic);

        pupilRepository.save(hermioneGrainger);
    }
}
