package com.test.BB.TestBBAPI.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacterListResponse {
    private List<CharactersBB> data;
}
