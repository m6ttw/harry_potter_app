package com.backend.controller;

import com.backend.model.people.Pupil;
import com.backend.repository.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class PupilController {

    @Autowired
    private PupilRepository pupilRepository;

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @GetMapping(value = "/pupils")
    public ResponseEntity<List<Pupil>> getAllPupils(){
        return new ResponseEntity<>(pupilRepository.findAll(), HttpStatus.OK);
    }
}
