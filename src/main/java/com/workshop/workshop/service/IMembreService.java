package com.workshop.workshop.service;

import com.workshop.workshop.model.User;

import java.util.Collection;

public interface IMembreService {

    User create(User user);
    User update(User user);

    User get(Long id);

    User findByEmail(String email);

    Collection<User> list();
    Boolean delete(Long id);


}
