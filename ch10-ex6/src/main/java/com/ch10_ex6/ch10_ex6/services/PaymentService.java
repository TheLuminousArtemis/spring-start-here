package com.ch10_ex6.ch10_ex6.services;

import com.ch10_ex6.ch10_ex6.exceptions.NotEnoughMoneyException;
import com.ch10_ex6.ch10_ex6.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
