package com.ch10_ex6.ch10_ex6.controllers.aspects;


import com.ch10_ex6.ch10_ex6.exceptions.NotEnoughMoneyException;
import com.ch10_ex6.ch10_ex6.models.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControlAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to make the payment");
        return ResponseEntity.badRequest().body(errorDetails);
    }
}
