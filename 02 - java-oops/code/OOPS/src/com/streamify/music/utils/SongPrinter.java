package com.streamify.music.utils;

import com.streamify.music.model.Song;

public class SongPrinter {
    public static void printGenre(Song song){
        System.out.println("Genre : " + song.genre);
    }
}
