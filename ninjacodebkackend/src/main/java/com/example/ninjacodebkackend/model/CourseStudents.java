package com.example.ninjacodebkackend.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.HibernateError;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

@Data
@Entity(name = "[CourseStudents]")
@Table(name = "[CourseStudents]")
public class CourseStudents {

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(columnDefinition = "CHAR(32)")
    @Id
    String Id;

    @ManyToOne
    @JoinColumn(name = "Id_Student")
    Students students;

    @ManyToOne
    @JoinColumn(name = "Id_Courses")
    Courses courses;
}
