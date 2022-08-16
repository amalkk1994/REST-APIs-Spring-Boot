package com.test.BB.TestBBAPI.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice // for fetching the message from the properties file and using it.
public class BBExceptionHandler {

    private final MessageSource messageSource; // getting property value from validations.properties (any property file)

    @Autowired
    public BBExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(Exception.class) // when exception occurs below routine will be triggered (since Exception.class all exceptions will be handled here)
    public ResponseEntity<ErrorResponse> handleException(Exception exception, Locale locale) {
        String message = messageSource.getMessage(exception.getMessage(),null, locale);
        ErrorResponse errorResponse = ErrorResponse.builder().message(message).httpCode(HttpStatus.BAD_REQUEST.value()).build();
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
