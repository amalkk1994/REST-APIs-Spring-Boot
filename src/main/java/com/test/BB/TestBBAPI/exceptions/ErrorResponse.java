package com.test.BB.TestBBAPI.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

    @NotNull
    @JsonProperty("http_code")
    private int httpCode;
    private String message;
}
