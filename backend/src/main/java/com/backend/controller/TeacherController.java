package com.backend.controller;

import com.backend.model.people.Teacher;
import com.backend.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping(value = "/teachers")
    public ResponseEntity<List<Teacher>> getAllTeachers(){
        return new ResponseEntity<>(teacherRepository.findAll(), HttpStatus.OK);
    }
}
