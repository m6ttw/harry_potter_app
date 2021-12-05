package com.backend.components;

import com.backend.model.Birthday;
import com.backend.model.creatures.Creature;
import com.backend.model.items.*;
import com.backend.model.people.*;
import com.backend.repository.*;

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
    OtherPersonRepository otherPersonRepository;

    @Autowired
    CreatureRepository creatureRepository;

    @Autowired
    BookRepository bookRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        Pupil harryPotter = new Pupil("Harry", "Potter", "half-blood", new Birthday(1980, 7, 31), "Gryffindor", new Wand("phoenix feather", "holly", 11.00), "stag");
        pupilRepository.save(harryPotter);
        Creature hedwig = new Creature("Hedwig", "owl", harryPotter);
        creatureRepository.save(hedwig);
        harryPotter.addPet(hedwig);
        pupilRepository.save(harryPotter);

        Pupil ronWeasley = new Pupil("Ronald", "Weasley", "pure-blood", new Birthday(1980, 3, 1), "Gryffindor", new Wand("unicorn hair", "ash", 12.00), "jack russell");
        pupilRepository.save(ronWeasley);
        Creature scabbers = new Creature("Scabbers", "rat", ronWeasley);
        creatureRepository.save(scabbers);
        ronWeasley.addPet(scabbers);
        pupilRepository.save(ronWeasley);

        Pupil hermioneGrainger = new Pupil("Hermione", "Grainger", "muggle-born", new Birthday(1979, 9, 19), "Gryffindor", new Wand("dragon heartstring", "vine wood", 10.75), "otter");
        pupilRepository.save(hermioneGrainger);
        Creature crookshanks = new Creature("Crookshanks", "cat", hermioneGrainger);
        creatureRepository.save(crookshanks);
        hermioneGrainger.addPet(crookshanks);
        pupilRepository.save(hermioneGrainger);
        Book historyOfMagic = new Book("A History of Magic", "Bathilda Bagshot", hermioneGrainger);
        bookRepository.save(historyOfMagic);
        hermioneGrainger.addBook(historyOfMagic);
        pupilRepository.save(hermioneGrainger);

        Teacher albusDumbledore = new Teacher("Albus", "Dumbledore", "half-blood", new Birthday(1881, 8, 27), "Headmaster", new Wand("thestral hair", "elder", 15.00), "phoenix");
        teacherRepository.save(albusDumbledore);

        Teacher minervaMcGonagall = new Teacher("Minerva", "McGonagall", "half-blood", new Birthday(1935, 10, 4), "Transfiguration", new Wand("dragon heartstring", "fir", 9.5), "cat");
        teacherRepository.save(minervaMcGonagall);

        OtherPerson hagrid = new OtherPerson("Rubeus", "Hagrid", "half-giant", new Birthday(1928, 12,6), "gamekeeper", new Wand("unknown", "oak", 16.00), "none");
        otherPersonRepository.save(hagrid);
        Creature aragog = new Creature("Aragog", "acromantula", hagrid);
        creatureRepository.save(aragog);
        Creature fang = new Creature("Fang", "dog", hagrid);
        creatureRepository.save(fang);
        Creature fluffy = new Creature("Fluffy", "Giant three-headed dog", hagrid);
        creatureRepository.save(fluffy);
        Creature norbert = new Creature("Norbert", "Norwegian Ridgeback dragon", hagrid);
        creatureRepository.save(norbert);
        hagrid.addPet(aragog);
        hagrid.addPet(fang);
        hagrid.addPet(fluffy);
        hagrid.addPet(norbert);
        otherPersonRepository.save(hagrid);
    }
}
