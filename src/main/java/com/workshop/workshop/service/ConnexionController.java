package com.workshop.workshop.service;

//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.security.core.Authentication;

@Controller
public class ConnexionController {

    @GetMapping("/")
    public String homePage(Model model) {
        return "well";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "FormUser";
    }

    @GetMapping("/welcome")
    public String welcomePage(Model model) {
        /*Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("username", auth.getPrincipal());*/

        return "welcome";
    }
}
