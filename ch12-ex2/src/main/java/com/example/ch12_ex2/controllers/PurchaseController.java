package com.example.ch12_ex2.controllers;

import com.example.ch12_ex2.model.Purchase;
import com.example.ch12_ex2.repository.PaymentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final PaymentRepository paymentRepository;

    public PurchaseController(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        paymentRepository.storePurchases(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchases(){
        return paymentRepository.findAllPurchases();
    }


}
