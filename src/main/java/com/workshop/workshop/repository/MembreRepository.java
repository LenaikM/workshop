package com.workshop.workshop.repository;

import com.workshop.workshop.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreRepository extends JpaRepository <Membre, Long> {

    Membre findByEmail(String email);
    Membre findByName(String name);

}
