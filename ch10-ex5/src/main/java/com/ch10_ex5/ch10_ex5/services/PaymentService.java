package com.ch10_ex5.ch10_ex5.services;

import com.ch10_ex5.ch10_ex5.exceptions.NotEnoughMoneyException;
import com.ch10_ex5.ch10_ex5.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
