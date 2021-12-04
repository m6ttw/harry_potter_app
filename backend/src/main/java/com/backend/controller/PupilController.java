package com.backend.controller;

import com.backend.exceptions.NotFoundException;
import com.backend.model.people.Pupil;
import com.backend.repository.PupilRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
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
}
