package com.example.prison.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="crime")
public class Crime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nom")
    private String nom;
    @Column(name="peine")
    private int peine;

    public Crime(){

    }
    public Crime(Long id, String nom, int peine) {
        this.id = id;
        this.nom = nom;
        this.peine = peine;
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

    public int getPeine() {
        return peine;
    }

    public void setPeine(int peine) {
        this.peine = peine;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", peine=" + peine +
                '}';
    }
}
