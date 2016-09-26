package com.example.nico.myapplication;

/**
 * Created by Nico on 26/09/2016.
 */

public class Intervalle {
    private int inf;
    private int sup;

    public Intervalle(int inf, int sup){
        this.inf = inf;
        this.sup = sup;
    }

    public int getInf() {
        return inf;
    }

    public int getSup() {
        return sup;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    public void setSup(int sup) {
        this.sup = sup;
    }

    public boolean contient(int x) {
        if (x > inf && x < sup) {
            return true;
        } else {
            return false;
        }
    }


    public boolean contient(Intervalle i) {
        if (i.getInf() > inf && i.getSup() < sup) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estDisjointDe( Intervalle i) {
        if (i.getInf() > inf) {
            return true;
        } else {
            return false;
        }
    }

    public boolean intersecte( Intervalle i) {
        if (i.getInf() < sup) {
            return true;
        } else {
            return false;
        }
    }

    public Intervalle intersection(Intervalle i) {
        if(intersecte(i)){
            Intervalle result = new Intervalle(i.getInf(), sup);
            return result;
        } else {
            return null;
        }
    }

    public Intervalle union(Intervalle i) {
        if(!intersecte(i)){
            Intervalle result = new Intervalle(sup, i.getInf());
            return result;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Intervalle{" +
                "inf=" + inf +
                ", sup=" + sup +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Intervalle)) return false;

        Intervalle that = (Intervalle) o;

        if (getInf() != that.getInf()) return false;
        return getSup() == that.getSup();

    }

}
