package com.mediatech.mediatech.exception.handler;

import com.mediatech.mediatech.exception.EntityAlreadyExistsException;
import com.mediatech.mediatech.exception.EntityNotFoundException;
import com.mediatech.mediatech.shared.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;


@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = {EntityNotFoundException.class})
    public ResponseEntity<Object> entityNotFoundException(EntityNotFoundException ex) {
        ErrorMessage errorMessage = ErrorMessage.builder()
                .message(ex.getMessage())
                .timestamp(new Date())
                .code(404)
                .build();
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {EntityAlreadyExistsException.class})
    public ResponseEntity<Object> entityNotFoundException(EntityAlreadyExistsException ex) {
        ErrorMessage errorMessage = ErrorMessage.builder()
                .message(ex.getMessage())
                .timestamp(new Date())
                .code(409)
                .build();
        return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);
    }
}