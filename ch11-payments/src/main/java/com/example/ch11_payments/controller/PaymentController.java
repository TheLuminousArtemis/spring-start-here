package com.example.ch11_payments.controller;

import com.example.ch11_payments.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentController {
    private static Logger logger = Logger.getLogger(PaymentController.class.getName());
    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(@RequestHeader String requestId, @RequestBody Payment payment){
        logger.info("Received request with ID: " + requestId + "\nAmount: " + payment.getAmount());
        payment.setId(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(payment);
    }
}
