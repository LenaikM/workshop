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
public class Cours {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long idCours;

    private String nomCours;
    private String professeur;

    @ManyToOne()
    @JoinColumn(name = "nomSalle", nullable = false)
    private Salle salleCours;

}
