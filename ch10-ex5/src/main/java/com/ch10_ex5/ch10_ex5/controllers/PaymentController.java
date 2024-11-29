package com.ch10_ex5.ch10_ex5.controllers;

import com.ch10_ex5.ch10_ex5.exceptions.NotEnoughMoneyException;
import com.ch10_ex5.ch10_ex5.models.ErrorDetails;
import com.ch10_ex5.ch10_ex5.models.PaymentDetails;
import com.ch10_ex5.ch10_ex5.services.PaymentService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(){
        try{
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        } catch (NotEnoughMoneyException e){
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make payment");
            return ResponseEntity.badRequest().body(errorDetails);
        }
    }
}
