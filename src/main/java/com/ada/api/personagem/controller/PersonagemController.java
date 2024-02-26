package com.ada.api.personagem.controller;

import com.ada.api.personagem.controller.dto.PersonagemDtoResponse;
import com.ada.api.personagem.controller.mapper.PersonagemMapper;
import com.ada.api.personagem.service.PersonagemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Log4j
@RequestMapping("/autor")
public class PersonagemController {

    private final PersonagemService service;
    private final PersonagemMapper mapper;

    @GetMapping
    public ResponseEntity<List<PersonagemDtoResponse>> findAll(){
        var personagem = service.findAll();
        var response = mapper.toDto(personagem);
        return ResponseEntity.ok(response);
    }


}
