package com.example.nico.myapplication;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Nico on 26/09/2016.
 */

public class Banque {

    private HashMap<Integer, Client> clients;
    private HashMap<Integer, Compte> comptes;

    public Banque(HashMap<Integer, Client> clients, HashMap<Integer, Compte> comptes) {
        this.clients = clients;
        this.comptes = comptes;
    }

    public HashMap<Integer, Client> getClients() {
        return clients;
    }

    public void setClients(HashMap<Integer, Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client) {
        clients.put(client.getId(), client);
    }

    public void delClient(Client client) {
        clients.remove(client.getId());
    }

    public HashMap<Integer, Compte> getComptes() {
        return comptes;
    }

    public void setComptes(HashMap<Integer, Compte> comptes) {
        this.comptes = comptes;
    }

    public void addCompte(Compte compte) {
        comptes.put(compte.getId(), compte);
    }

    public void delCompte(Compte compte) {
        comptes.remove(compte.getId());
    }
}
