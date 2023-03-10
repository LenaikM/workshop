package com.workshop.workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coach {

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
    private String dateInscription;
    private String telephone;
    private String note;

    @ManyToOne
    private Club club;



}
