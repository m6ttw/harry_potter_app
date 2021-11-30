package com.backend;

import com.backend.model.Birthday;
import com.backend.model.items.Wand;
import com.backend.model.people.Person;
import com.backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	private PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {
		this.personRepository.save(new Person("Harry", "Potter", "half-blood", new Birthday(1980, 7, 31), new Wand("phoenix feather", "holly", 11.00), "stag"));
		this.personRepository.save(new Person("Hermione", "Grainger", "muggle-born", new Birthday(1979, 9, 19), new Wand("dragon heartstring", "vine wood", 10.75), "otter"));
		this.personRepository.save(new Person("Ronald", "Weasley", "pure-blood", new Birthday(1980, 3, 1), new Wand("unicorn hair", "ash", 12.00), "jack russell"));
	}

}
