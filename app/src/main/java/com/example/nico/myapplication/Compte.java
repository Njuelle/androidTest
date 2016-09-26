package com.example.nico.myapplication;

/**
 * Created by Nico on 26/09/2016.
 */

public class Compte {
    private Integer id;
    private double solde;

    public Compte(Integer id, double solde) {
        this.id = id;
        this.solde = solde;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

}
