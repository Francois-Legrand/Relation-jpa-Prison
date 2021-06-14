package com.example.prison.models;

import javax.persistence.*;

@Entity
@Table
public class Cellule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="numero")
    private int numero;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "prisonnier_id")
    private Prisonnier prisonnier;

    public Prisonnier getPrisonnier() {
        return prisonnier;
    }

    public void setPrisonnier(Prisonnier prisonnier) {
        this.prisonnier = prisonnier;
    }

    public Cellule(){

    }
    public Cellule(Long id, int numero) {
        this.id = id;
        this.numero = numero;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cellule{" +
                "id=" + id +
                ", numero=" + numero +
                '}';
    }
}
