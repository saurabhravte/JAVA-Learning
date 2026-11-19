package com.streamify.music.model;

public class Song {
    private String title;
    private int playCount;
    public String genre = "Pop";

    public Song(String title, int playCount) {
        this.title = title;
        this.playCount = playCount;
    }

    public void printSummary(){
        System.out.println("Title: " + title);
        System.out.println("Play Count: " + playCount);
    }
}
