package com.test.BB.TestBBAPI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CharacterBB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long char_id;
    private String name;
    private String occupation;
    private String nickName;

    @Override
    public String toString() {
        return "Character{" +
                "char_id=" + char_id +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
