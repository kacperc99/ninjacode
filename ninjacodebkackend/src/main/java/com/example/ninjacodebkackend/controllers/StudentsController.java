package com.example.ninjacodebkackend.controllers;

import com.example.ninjacodebkackend.model.Students;
import com.example.ninjacodebkackend.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @GetMapping("")
    public List<Students> getAllStudents(){
        return studentsService.getAllStudents();
    }
    @GetMapping("/{Id}")
    public Students getStudentById(@PathVariable long Id){
        return studentsService.getStudentById(Id);
    }
    @PostMapping("")
    public Students createStudent(@RequestBody Students student){
        return studentsService.createStudent(student);
    }
}
