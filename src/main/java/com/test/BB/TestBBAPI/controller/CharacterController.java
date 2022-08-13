package com.test.BB.TestBBAPI.controller;

import com.test.BB.TestBBAPI.model.CharacterBB;
import com.test.BB.TestBBAPI.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/characters")
    public List<CharacterBB> getAllCharacters() {
      //  return new CharacterBB(1L, "Walter White", "High school chemistry Teacher", "HeisenBerg");
     return characterService.getAllCharacters();
    }

    @GetMapping("/character/{id}")
    public CharacterBB getCharacterById(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    @GetMapping("/character")
    public CharacterBB getCharacterByName(@RequestParam(value = "name", required = false) String name) {
        return characterService.getCharacterByName(name);
    }

    @PutMapping("/character")
    public CharacterBB updateCharacter(@RequestBody CharacterBB characterBB){
        return characterService.updateCharacter(characterBB);
    }

    @PostMapping("/character")
    public CharacterBB createCharacter(@RequestBody CharacterBB characterBB) {
        return characterService.createCharacter(characterBB);
    }

    @DeleteMapping("/character/{id}")
    public String deleteCharacter(@PathVariable  Long id) {
        return characterService.deleteCharacter(id);
    }
}
