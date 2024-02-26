package com.ada.api.personagem.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonagemDtoResponse {
    private UUID id;
    private String nome;
    private String papelHistoria;
    private float altura;
    private ZonedDateTime horaCriacao;
}
