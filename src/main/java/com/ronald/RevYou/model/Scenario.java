package com.ronald.RevYou.model;

import com.ronald.RevYou.utils.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @NotNull(message = "O Título é obrigatório!")
    private String title;

    @NotNull(message = "O tipo do desafio é obrigatório!")
    private Type type;

    @NotNull(message = "Esse campo é obrigatório!")
    private String content;

    @NotNull(message = "O nível de dificuldade é obrigatório!")
    @Min(value = 1, message = "O nível minimo é 1")
    @Max(value = 5, message = "O nivel maximo é 5")
    private int difficulty_rating;
}
