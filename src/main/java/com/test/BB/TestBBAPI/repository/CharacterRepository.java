package com.test.BB.TestBBAPI.repository;

import com.test.BB.TestBBAPI.model.CharacterBB;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends CrudRepository<CharacterBB, Long> {

    List<CharacterBB> findAllByName(String name);
    //CharacterBB findByName(String name);
    CharacterBB findByNameAndOccupation(String name, String occupation); // multiple conditions
}
