package com.example.api;

import java.util.List;

public class User {
    private int id;
    private String name;
    private boolean isActivte;
    private Job job;
    private List<Favorite> favorites;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActivte() {
        return isActivte;
    }

    public void setActivte(boolean activte) {
        isActivte = activte;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }
}
