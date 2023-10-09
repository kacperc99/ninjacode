package com.example.ninjacodebkackend.repos;

import com.example.ninjacodebkackend.model.CourseStudents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseStudentsRepository extends JpaRepository<CourseStudents, String> {
}
