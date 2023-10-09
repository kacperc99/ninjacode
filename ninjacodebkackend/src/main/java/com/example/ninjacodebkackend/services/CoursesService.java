package com.example.ninjacodebkackend.services;

import com.example.ninjacodebkackend.model.CourseStudents;
import com.example.ninjacodebkackend.model.Courses;
import com.example.ninjacodebkackend.repos.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;

    public List<Courses> getAllCourses(){
        return coursesRepository.findAll();
    }

    public Courses getCourseById(long Id){
        return coursesRepository.findById( Id).orElse(null);
    }
    public Courses addCourse(Courses course){
        return coursesRepository.save(course);
    }
}
