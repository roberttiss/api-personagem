package com.ada.api.personagem.service;

import com.ada.api.personagem.model.Personagem;
import com.ada.api.personagem.model.PersonagemRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonagemService {

    private final PersonagemRepository repository;

    public List<Personagem> findAll(){
        return repository.findAll();
    }

    public Optional<Personagem> findById(final UUID id){
        return repository.findById(id);
    }

    public Optional<Personagem> findByNome(String nome){
        return repository.findByNome(nome);
    }
    public void deleteById(final UUID id){
        repository.deleteById(id);
    }

    public Optional<Personagem> update(final UUID id, final Personagem updatePersonagem){
        var personagemOptional = repository.findById(id);

        if (personagemOptional.isPresent()){
            var personagemDB = personagemOptional.get();
            personagemDB.setNome(updatePersonagem.getNome());
            personagemDB.setPapelHistoria(updatePersonagem.getPapelHistoria());

            repository.save(personagemDB);

            return Optional.of(personagemDB);
        }
        return Optional.empty();
    }

    @Transactional
    public Personagem save(final Personagem newPersonagem){
        return repository.save(newPersonagem);
    }
}
