package com.ch9_ex2.ch9_ex2.model;

import com.ch9_ex2.ch9_ex2.services.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private LoggedUserManagementService loggedUserManagementService;
    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService){
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login(){
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
