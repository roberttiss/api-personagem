package com.ada.api.personagem.controller.mapper;

import com.ada.api.personagem.controller.dto.PersonagemDto;
import com.ada.api.personagem.controller.dto.PersonagemDtoResponse;
import com.ada.api.personagem.model.Personagem;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonagemMapper {

    public PersonagemDtoResponse toDto(Personagem personagem){
        return PersonagemDtoResponse.builder()
                .id(personagem.getId())
                .nome(personagem.getNome())
                .papelHistoria(personagem.getPapelHistoria())
                .altura(personagem.getAltura())
                .horaCriacao(personagem.getHoraCriacao())
                .build();
    }

    public Personagem toEntity(PersonagemDto dto){
        return Personagem.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .papelHistoria(dto.getPapelHistoria())
                .altura(dto.getAltura())
                .horaCriacao(dto.getHoraCriacao())
                .build();
    }

    public List<PersonagemDtoResponse> toDto(final List <Personagem> entity){
        return entity.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

}
