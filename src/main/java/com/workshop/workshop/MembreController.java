package com.workshop.workshop;

import com.workshop.workshop.implementation.MembreServiceImpl;
import com.workshop.workshop.model.Membre;
import com.workshop.workshop.repository.MembreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accueil")
public class MembreController {

    private final MembreServiceImpl membreService;

    @PostMapping("/connexion")
    public ResponseEntity<Response> auth (@RequestBody @RequestParam String email, @RequestParam String password){



        return null;
    }
}
