package com.backend.controller;

import com.backend.model.people.OtherPerson;
import com.backend.repository.OtherPersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OtherPersonController {

    @Autowired
    private OtherPersonRepository otherPersonRepository;

    @GetMapping("/others")
    public ResponseEntity<List<OtherPerson>> getAllOtherPersons(){
        return new ResponseEntity<>(otherPersonRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/others/{id}")
    public ResponseEntity getOtherPerson(@PathVariable long id){
        return new ResponseEntity<>(otherPersonRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/others")
    public ResponseEntity<OtherPerson> createOtherPerson(@RequestBody OtherPerson otherPerson){
        otherPersonRepository.save(otherPerson);
        return new ResponseEntity<>(otherPerson, HttpStatus.CREATED);
    }

    @PatchMapping("/others/{id}")
    public ResponseEntity<OtherPerson> updateOtherPerson(@RequestBody OtherPerson otherPerson){
        otherPersonRepository.save(otherPerson);
        return new ResponseEntity<>(otherPerson, HttpStatus.OK);
    }
}
