package com.ronald.RevYou.model;

import com.ronald.RevYou.utils.ExperienceLevel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @NotNull
    @Column(unique = true)
    private String userName;

    @Enumerated(EnumType.STRING)
    @Column(name = "experiencie_level")
    private ExperienceLevel experienceLevel;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}
