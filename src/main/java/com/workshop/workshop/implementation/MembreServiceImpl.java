package com.workshop.workshop.implementation;

import com.workshop.workshop.model.Membre;
import com.workshop.workshop.repository.MembreRepository;
import com.workshop.workshop.service.MembreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

import static java.lang.Boolean.TRUE;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class MembreServiceImpl implements MembreService {

    private final MembreRepository membreRepo;

    @Override
    public Membre create(Membre membre) {
        System.out.println(membre.getEmail()); //affiche l'email du membre passé en paramètre
        return membreRepo.save(membre); //enregistre le nouveau memebre dans la base de données
    }

    @Override
    public Membre update(Membre membre) {
        System.out.println(membre);
        return membreRepo.save(membre);
    }

    @Override
    public Membre get(Long id) {
        return null;
    }

    @Override
    public Collection<Membre> list(int limit) {
        return membreRepo.findAll(PageRequest.of(0, limit)).toList(); //récupère toutes les pages de la 1ère à la limite imposé sous forme de liste
    }

    @Override
    public Boolean delete(Long id) {
        System.out.println(id);
        membreRepo.deleteById(id);
        return TRUE;
    }
}
