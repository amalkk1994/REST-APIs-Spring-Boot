package com.test.BB.TestBBAPI.repository;

import com.test.BB.TestBBAPI.model.CharacterBB;
import com.test.BB.TestBBAPI.model.CharactersBB;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CharacterRepository extends MongoRepository<CharactersBB, String> {

   // List<CharacterBB> findAllByName(String name);
    //CharacterBB findByName(String name);
  //  CharacterBB findByNameAndOccupation(String name, String occupation); // multiple conditions
}
