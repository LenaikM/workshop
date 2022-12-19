package com.workshop.workshop.model;

import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String nom;
    private String adresse;
    private String codePostale;

    @Column(unique = true)
    private String telephone;
}
