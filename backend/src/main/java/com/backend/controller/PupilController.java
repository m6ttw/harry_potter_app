package com.backend.controller;

import com.backend.model.people.Pupil;
import com.backend.repository.PupilRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PupilController {

    @Autowired
    private PupilRepository pupilRepository;

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @GetMapping("/pupils")
    public ResponseEntity<List<Pupil>> getAllPupils(){
        return new ResponseEntity<>(pupilRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/pupils/{id}")
    public ResponseEntity getPupil(@PathVariable long id){
        return new ResponseEntity<>(pupilRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/pupils")
    public ResponseEntity<Pupil> createPupil(@RequestBody Pupil pupil){
        pupilRepository.save(pupil);
        return new ResponseEntity<>(pupil, HttpStatus.CREATED);
    }

    @PatchMapping("/pupils/{id}")
    public ResponseEntity<Pupil> updatePupil(@RequestBody Pupil pupil){
        pupilRepository.save(pupil);
        return new ResponseEntity<>(pupil, HttpStatus.OK);
    }
}
