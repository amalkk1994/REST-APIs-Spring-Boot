package com.test.BB.TestBBAPI.service;

import com.test.BB.TestBBAPI.model.CharacterBB;
import com.test.BB.TestBBAPI.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {

        this.characterRepository = characterRepository;
    }

    public CharacterBB createCharacter(CharacterBB characterBB) {

        return characterRepository.save(characterBB);
    }

    public CharacterBB getCharacterById(Long id) {
        return characterRepository.findById(id).orElseThrow(() -> new RuntimeException("No record found!!!"));
    }

    public List<CharacterBB> getCharacterByName(String name) throws Exception {
       if(isInteger(name)) {
           throw new Exception("invalid.name");
       }
        return characterRepository.findAllByName(name);
    }

    private boolean isInteger(String name) {
        try {
            Integer.parseInt(name);
            return true;
        } catch(Exception err) {
           return false;
        }
    }

    public List<CharacterBB> getAllCharacters() {
        // return characterRepository.findAll().get;
       return StreamSupport.stream(characterRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public CharacterBB updateCharacter(CharacterBB characterBB) {
        return characterRepository.save(characterBB);
    }

    public String deleteCharacter(Long id) {
        characterRepository.deleteById(id);
        return "Record with id: "+id+" deleted";
    }
}
