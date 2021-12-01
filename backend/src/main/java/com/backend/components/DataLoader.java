package com.backend.components;

import com.backend.model.Birthday;
import com.backend.model.items.Wand;
import com.backend.model.people.Pupil;
import com.backend.repository.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PupilRepository pupilRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        pupilRepository.save(new Pupil("Harry", "Potter", "half-blood", new Birthday(1980, 7, 31), "Gryffindor", new Wand("phoenix feather", "holly", 11.00), "stag"));
        pupilRepository.save(new Pupil("Hermione", "Grainger", "muggle-born", new Birthday(1979, 9, 19), "Gryffindor", new Wand("dragon heartstring", "vine wood", 10.75), "otter"));
        pupilRepository.save(new Pupil("Ronald", "Weasley", "pure-blood", new Birthday(1980, 3, 1), "Gryffindor", new Wand("unicorn hair", "ash", 12.00), "jack russell"));
    }
}
