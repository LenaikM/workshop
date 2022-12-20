package com.workshop.workshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;
    private String prenom;

    @Column(unique = true)
    @NonNull
    private String email;

    private String mdp;
    private String dateNaissance;
    private String adresse;
    private int codePostal;
    private String telephone;

    @ManyToOne
    private Role role;

    public User(String name, String prenom, @NonNull String email, String mdp, String dateNaissance, String adresse, int codePostal, String telephone, Role role) {
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.telephone = telephone;
        this.role = role;
    }


}
