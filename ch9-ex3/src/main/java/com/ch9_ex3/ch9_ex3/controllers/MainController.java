package com.ch9_ex3.ch9_ex3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ch9_ex3.ch9_ex3.services.LoggedUserManagementService;
import com.ch9_ex3.ch9_ex3.services.LoginCountService;

@Controller
public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    public MainController(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService){
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String logout, Model model){
        if (logout!=null){
            loggedUserManagementService.setUsername(null);
        }

        String username = loggedUserManagementService.getUsername();
        int viewcount = loginCountService.getCount();
        model.addAttribute("username" , username);
        model.addAttribute("loginCount", viewcount);

        if (username == null){
            return "redirect:/";
        }
        return "main.html";
    }
}