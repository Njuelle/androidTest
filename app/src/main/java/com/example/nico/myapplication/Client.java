package com.example.nico.myapplication;

/**
 * Created by Nico on 26/09/2016.
 */

public class Client {

    private Integer id;
    private String name;

    public Client(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
