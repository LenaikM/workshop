package com.workshop.workshop.service;

import com.fasterxml.jackson.databind.type.LogicalType;
import com.workshop.workshop.implementation.UserServiceImpl;
import com.workshop.workshop.model.User;
import com.workshop.workshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

@RestController
@RequiredArgsConstructor
public class RegistrationController {

    private final UserServiceImpl userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return (List<User>) userService.list();

    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userService.create(user);
    }

    /* @PostMapping("/registration")
    public ResponseEntity<Response> auth (@RequestBody @RequestParam String email,
                                          @RequestParam String password){

        return null;
    }
   @GetMapping("/registration")
    public String registrationPage(Model model) {

        User user = new User();
        model.addAttribute("user", user);

        List<String> listAbonnement = Arrays.asList("Basic", "Priviliges", "Premium");
        model.addAttribute("listAbonnement", listAbonnement);
        return "FormUser";
    }
    @PostMapping("/register/save")
    public String submitRegistrationForm(Model model, @ModelAttribute("user") User user, UserServiceImpl userService){

        model.addAttribute("user", user);
        userService.create(user);
        System.out.println(user.getName());
        return "register-success";
    }*/

}
