package com.workshop.workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nom", nullable = false, insertable = false, updatable = false)
    private User souscripteur;

    @ManyToOne
    @JoinColumn(name = "nom", nullable = false, insertable = false, updatable = false)
    private User beneficiaire;

    private String adresseSouscripteur;
    private String codePostaleSouscrpteur;
    private String etablissementBancaire;
    private String iban;
    private String bic;

    @ManyToOne
    private Abonnement formule;




}
