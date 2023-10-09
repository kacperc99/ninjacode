package com.example.ninjacodebkackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Data
@Entity(name="[Courses]")
@Table(name="[Courses]")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;
    @NotBlank(message = "Course name is mandatory")
    private String Course_Name;

    @OneToMany(mappedBy = "courses")
    Set<CourseStudents> courses;

    public Courses(){

    }

    public Courses(String Course_Name) {
        this.Course_Name = Course_Name;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

}
