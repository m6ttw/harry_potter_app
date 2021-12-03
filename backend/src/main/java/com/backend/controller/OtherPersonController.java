package com.backend.controller;

import com.backend.model.people.OtherPerson;
import com.backend.repository.OtherPersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class OtherPersonController {

    @Autowired
    private OtherPersonRepository otherPersonRepository;

    @GetMapping(value = "/otherpersons")
    public ResponseEntity<List<OtherPerson>> getAllOtherPersons(){
        return new ResponseEntity<>(otherPersonRepository.findAll(), HttpStatus.OK);
    }
}
