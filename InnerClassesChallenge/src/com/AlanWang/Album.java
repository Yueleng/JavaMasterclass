package com.AlanWang;

import com.sun.org.apache.bcel.internal.generic.LUSHR;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.LinkedList;

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

    public boolean addToPlayList (int trackNumber, LinkedList<Song> playList) {
        int idx = trackNumber - 1;
        if ((idx >= 0 ) && (idx < this.songs.size())) {
            playList.add(this.songs.get(idx));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    // Overloading
    public  boolean addToPlayList (String title, LinkedList<Song> playList) {
        Song CurrentSong = findSong(title);
        if (CurrentSong != null) {
            playList.add(CurrentSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    // Inner class
    private class SongList {
        private ArrayList<Song> songs;

        // Constructor
        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (this.songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song currentSong: this.songs) {

            }
        }
    }

}
