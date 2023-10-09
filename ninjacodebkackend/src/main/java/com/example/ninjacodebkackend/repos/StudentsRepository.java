package com.example.ninjacodebkackend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ninjacodebkackend.model.Students;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
}
