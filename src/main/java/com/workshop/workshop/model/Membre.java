package com.workshop.workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Membre implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String nom;
    private String prenom;

    @Column(unique = true)
    @NonNull
    private String email;

    private String mdp;
    private String dateNaissance;
    private String adresse;
    private int codePostal;
    private String telephone;

}
