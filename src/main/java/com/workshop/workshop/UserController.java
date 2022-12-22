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
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/lusers")
    public List<User> getUsers(){
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/lusers")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PostMapping("/lconnexion")
    public ResponseEntity<Response> auth (@RequestBody @RequestParam String email,
                                          @RequestParam String password){

        return null;
    }
}
