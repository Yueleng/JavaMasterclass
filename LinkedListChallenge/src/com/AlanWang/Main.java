package com.AlanWang;

import com.sun.media.jfxmedia.events.PlayerStateListener;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {
	    // Create a program that implements playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order they are added
        // Once the songs have been added to the playlist, create a menu of options to:
        // - quit, skip, forward to the next song, skip backwards to a previous song. Replay the current song,
        // List the songs in the playlist.
        // A song must exist in an album before it can be added to the playlist (so you can only play songs before we started tracking the direction we were going.
        // Hint: To replay a song, consider what happened when we went back and forth from a city before we started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove())

        Album album = new Album("Stormbringer", "Deeep Purple");
        album.addSong("Strombringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        Album album2 = new Album("For those about to rock", "AC/DC");
        album2.addSong("For those about to rock", 5.44);
        album2.addSong("I put the finger on you", 3.25);
        album2.addSong("Lets go", 3.45);
        album2.addSong("Inject the venom", 3.33);
        album2.addSong("Snowballed", 4.51);
        album2.addSong("Evil walks", 3.45);
        album2.addSong("C.O.D", 5.25);
        album2.addSong("Breaking the rules", 5.32);
        album2.addSong("Night of the long knives", 5.12);
        albums.add(album2);

        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); // Does not exist
        albums.get(0).addToPlayList(9, playList);

        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No song in playList");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.printf("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playList");
                        forward = false; // true
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the top of the playList");
                        forward = true; // false;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                            if (listIterator.hasNext()) {
                                System.out.println("Now replaying " + listIterator.next().toString());
                                forward = true;
                            } else {
                                System.out.println("We have reached the end of the list");
                            }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions :\npress");
        System.out.println("0 - to quit\n" +
                           "1 - to play next song\n" +
                           "2 - to play previous song\n" +
                           "3 - to replay the current song\n" +
                           "4 - list songs in the playList\n" +
                           "5 - print available actions.\n" +
                           "6 - delete current song from playList");
    }

    private static void printList(LinkedList<Song> playList) {
        // We use Iterator here, it only has the ability to go next.
        Iterator<Song> iterator = playList.iterator();
        System.out.println("======================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======================================");
    }
}
