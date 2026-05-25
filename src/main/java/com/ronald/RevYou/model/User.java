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

    @NotNull(message = "Nome de Usuário/E-mail é obrigatorio!")
    @Column(unique = true)
    private String userName;

    @Enumerated(EnumType.STRING)
    @Column(name = "experiencie_level")
    @NotNull(message = "Nível de senioridade é obrigatorio!")
    private ExperienceLevel experienceLevel;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}
