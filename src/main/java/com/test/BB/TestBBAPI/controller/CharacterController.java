package com.test.BB.TestBBAPI.controller;

import com.test.BB.TestBBAPI.model.CharacterBB;
import com.test.BB.TestBBAPI.model.CharacterListResponse;
import com.test.BB.TestBBAPI.model.CharactersBB;
import com.test.BB.TestBBAPI.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/characters")
    public List<CharactersBB> getAllCharacters() {
      //  return new CharacterBB(1L, "Walter White", "High school chemistry Teacher", "HeisenBerg");
    // return characterService.getAllCharacters();
     //   CharacterListResponse characterListResponse = new CharacterListResponse();
     //   characterListResponse.setData(characterService.getAllCharacters());
        return characterService.getAllCharacters();
    }


    @GetMapping("/characters/{id}")
    public List<CharactersBB> getCharacterById(@PathVariable String id) {
       // CharacterListResponse characterListResponse = new CharacterListResponse();
       // characterListResponse.setData(characterService.getCharacterById(id));
        List<CharactersBB> characterList = new ArrayList<CharactersBB>();
        characterList.add(characterService.getCharacterById(id));
        return characterList;
    }



    /*
    @GetMapping("/character/{id}")
    public CharacterBB getCharacterById(@PathVariable String id) {
        return characterService.getCharacterById(id);
    }

    @GetMapping("/character")
    public CharacterListResponse getCharacterByName(@RequestParam(value = "name", required = false) String name) throws Exception {
        CharacterListResponse characterListResponse = new CharacterListResponse();
        characterListResponse.setCharactersBB(characterService.getCharacterByName(name));
        return characterListResponse;
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
    public String deleteCharacter(@PathVariable  String id) {
        return characterService.deleteCharacter(id);
    }


     */
}
