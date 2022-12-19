package com.workshop.workshop.service;

import com.workshop.workshop.model.Membre;

import java.util.Collection;

public interface IMembreService {

    Membre create(Membre membre);
    Membre update(Membre membre);

    Membre get(Long id);

    Membre findByEmail(String email);

    Collection<Membre> list(int limit);
    Boolean delete(Long id);
}
