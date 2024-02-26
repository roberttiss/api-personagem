package com.ada.api.personagem.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
public class PersonagemDto {

    private UUID id;
    private String nome;
    private String papelHistoria;
    private float altura;
    private ZonedDateTime horaCriacao;
}
