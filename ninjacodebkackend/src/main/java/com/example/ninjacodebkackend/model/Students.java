package com.example.ninjacodebkackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Data
@Entity(name="[Students]")
@Table(name="[Students]")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;
    @NotBlank(message="Name is mandatory")
    private String name;
    @NotBlank(message="Surname is mandatory")
    private String surname;
    @Email(message = "E-mail should be valid")
    @NotBlank(message="E-mail is mandatory")
    private String email;

    @OneToMany(mappedBy = "students")
    Set<CourseStudents> students;

    public Students(){

    }
    public Students(String name, String surname, String email){
        this.name = name;
        this.surname=surname;
        this.email=email;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}

