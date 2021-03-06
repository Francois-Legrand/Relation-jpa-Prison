package com.example.prison.models;

import javax.persistence.*;

@Entity
@Table(name="danger")
public class Danger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom")
    private String nom;
    public Danger(){

    }
    public Danger(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Danger{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
