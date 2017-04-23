package com.dipti.spotsoon.app.models;


public class Video {

    private int id;
    private String title;
    private String timelabel;
    private String description;
    private int image;

    public Video() {
    }

    public Video(String title, String timelabel, String description, int image) {
        this.title = title;
        this.timelabel = timelabel;
        this.description = description;
        this.image = image;
    }

    public Video(int id, String title, String timelabel, String description, int image) {
        this.id = id;
        this.title = title;
        this.timelabel = timelabel;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTimelabel() {
        return timelabel;
    }

    public void setTimelabel(String timelabel) {
        this.timelabel = timelabel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
