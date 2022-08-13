package com.test.BB.TestBBAPI.repository;

import com.test.BB.TestBBAPI.model.CharacterBB;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<CharacterBB, Long> {

    CharacterBB findByName(String name);
}
