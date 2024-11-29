package com.ch9_ex3.ch9_ex3.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {
    private int count;

    public int getCount() {
        return count;
    }

    public void increment(){
        count++;
    }
}
