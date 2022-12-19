package com.workshop.workshop.service;

import com.workshop.workshop.model.Membre;

import java.util.Collection;

public interface MembreService {

    Membre create(Membre membre);
    Membre update(Membre membre);

    Membre get(Long id);
    Collection<Membre> list(int limit);
    Boolean delete(Long id);
}
