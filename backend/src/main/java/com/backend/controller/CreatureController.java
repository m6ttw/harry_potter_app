package com.backend.controller;

import com.backend.model.creatures.Creature;
import com.backend.repository.CreatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class CreatureController {

    @Autowired
    CreatureRepository creatureRepository;

    @GetMapping("/creatures")
    public ResponseEntity<List<Creature>> getAllCreatures() {
        return new ResponseEntity<>(creatureRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/creatures/{id}")
    public ResponseEntity getCreature(@PathVariable long id){
        return new ResponseEntity<>(creatureRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/creatures")
     public ResponseEntity<Creature> createCreature(@RequestBody Creature creature){
        creatureRepository.save(creature);
        return new ResponseEntity<>(creature, HttpStatus.CREATED);
     }

     @PatchMapping("/creatures/{id}")
     public ResponseEntity<Creature> updateCreature(@RequestBody Creature creature){
        creatureRepository.save(creature);
        return new ResponseEntity<>(creature, HttpStatus.OK);
     }

}
