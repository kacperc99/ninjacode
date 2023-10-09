package com.example.ninjacodebkackend.services;

import com.example.ninjacodebkackend.model.Students;
import com.example.ninjacodebkackend.repos.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class StudentsService {
    @Autowired
    private StudentsRepository studentsRepository;

    public List<Students> getAllStudents(){
        return studentsRepository.findAll();
    }
    public Students getStudentById(long Id){
        return studentsRepository.findById(Id).orElse(null);
    }
    /*public List<Students> getStudentsByCourse(){
        return studentsRepository.findBy()
    }*/
    public Students createStudent(Students student){
        return studentsRepository.save(student);
    }
}
