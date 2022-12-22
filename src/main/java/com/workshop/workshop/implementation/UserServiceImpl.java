package com.workshop.workshop.implementation;

import com.workshop.workshop.model.User;
import com.workshop.workshop.repository.UserRepository;
import com.workshop.workshop.service.IMembreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

import static java.lang.Boolean.TRUE;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class UserServiceImpl implements IMembreService {

    @Autowired
    private UserRepository userRepository;

    private final UserRepository membreRepo;

    @Override
    public User create(User user) {
        System.out.println(user.getEmail()); //affiche l'email du membre passé en paramètre
        return membreRepo.save(user); //enregistre le nouveau memebre dans la base de données
    }

    @Override
    public User update(User user) {
        System.out.println(user);
        return membreRepo.save(user);
    }

    @Override
    public User get(Long id) {
        System.out.println(id);
        return membreRepo.findById(id).get(); //avec le get on récupère le membre
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }


    @Override
    public Collection<User> list() {
        return membreRepo.findAll(); //récupère toutes les pages de la 1ère à la limite imposé sous forme de liste
    }

    @Override
    public Boolean delete(Long id) {
        System.out.println(id);
        membreRepo.deleteById(id);
        return TRUE;
    }
}
