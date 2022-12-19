package com.workshop.workshop;

import com.workshop.workshop.model.Membre;
import com.workshop.workshop.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/accueil")
public class MembreController {

    @Autowired
    MembreRepository membreRepository;

    @PostMapping("/connexion")
    public ResponseEntity<Response> auth (@RequestBody @RequestParam String email, @RequestParam String password){

        Membre membre;

        return
    }
}
