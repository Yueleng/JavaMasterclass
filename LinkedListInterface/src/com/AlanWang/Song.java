package com.AlanWang;

public class Song {
    private String title;
    private double duration;

    // Constructor
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }


}
