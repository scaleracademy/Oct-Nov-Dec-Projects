package com.example.springjpabasics1.common;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ErrorResponse {
    String message;

    private ErrorResponse(String message) {
        this.message = message;
    }

    public static ErrorResponse from(Exception e) {
        return new ErrorResponse(e.getMessage());
    }

}
