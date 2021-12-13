package com.backend.controller;

import com.backend.model.people.Teacher;
import com.backend.repository.TeacherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teachers")
    public ResponseEntity<List<Teacher>> getAllTeachers(){
        return new ResponseEntity<>(teacherRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/teachers/{id}")
    public ResponseEntity getTeacher(@PathVariable long id){
        return new ResponseEntity(teacherRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/teachers")
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher){
        teacherRepository.save(teacher);
        return new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/teachers/{id}/{firstName}")
    public ResponseEntity<Teacher> updateTeacherPartially(@PathVariable Long id, @PathVariable String firstName){
        Teacher teacher = teacherRepository.findById(id).get();
        teacher.setFirstName(firstName);
        return new ResponseEntity<>(teacherRepository.save(teacher), HttpStatus.OK);
    }
}
