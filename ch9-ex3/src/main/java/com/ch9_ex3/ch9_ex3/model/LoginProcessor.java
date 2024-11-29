package com.ch9_ex3.ch9_ex3.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import com.ch9_ex3.ch9_ex3.services.LoggedUserManagementService;
import com.ch9_ex3.ch9_ex3.services.LoginCountService;

@Component
@RequestScope
public class LoginProcessor {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;
    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService){
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    public boolean login(){
        loginCountService.increment();
        String username = this.getUsername();
        String password = this.getPassword();

        boolean loginResult = false;
        if("natalie".equals(username) && "password".equals(password)){
            loginResult = true;
            loggedUserManagementService.setUsername(username);
        }
        return loginResult;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
