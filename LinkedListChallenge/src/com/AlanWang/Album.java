package com.AlanWang;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    // Constructor
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    // method
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title) {
        for (Song currentSong : this.songs){
            if (currentSong.getTitle().equals(title)) {
                return currentSong;
            }
        }
        return null;
    }

    public boolean addToPlayList (int trackNumber, ArrayList<Song> playList) {
        int idx = trackNumber - 1;
        if ((idx >= 0 ) && (idx < this.songs.size())) {
            playList.add(this.songs.get(idx));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    // Overloading
    public  boolean addToPlayList (String title, ArrayList<Song> playList) {
        Song CurrentSong = findSong(title);
        if (CurrentSong != null) {
            playList.add(CurrentSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

}
