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
public class Salle {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String nomSalle;
    private String capaciteMax;
    private String metreCarre;

    @ManyToOne()
    @JoinColumn(name = "nom", nullable = false)
    private Club clubSalle;


}
