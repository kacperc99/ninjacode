package com.example.ninjacodebkackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message="Name is mandatory")
    private String name;
    @NotBlank(message="Surname is mandatory")
    private String surname;
    @NotBlank(message="E-mail is mandatory")
    private String email;
}
