package com.workshop.workshop;

import com.workshop.workshop.implementation.UserServiceImpl;
import com.workshop.workshop.model.User;
import com.workshop.workshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PostMapping("/connexion")
    public ResponseEntity<Response> auth (@RequestBody @RequestParam String email,
                                          @RequestParam String password){

        return null;
    }
}
