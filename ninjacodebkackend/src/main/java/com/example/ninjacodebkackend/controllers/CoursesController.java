package com.example.ninjacodebkackend.controllers;

import com.example.ninjacodebkackend.model.Courses;
import com.example.ninjacodebkackend.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    @GetMapping("")
    public List<Courses> getAllCourses(){
        return coursesService.getAllCourses();
    }

    @GetMapping("/{Id}")
    public Courses getCourseById(@PathVariable long Id){
        return coursesService.getCourseById(Id);
    }
    @PostMapping("")
    public Courses createCourse(@RequestBody Courses course){
        return coursesService.addCourse(course);
    }
}
