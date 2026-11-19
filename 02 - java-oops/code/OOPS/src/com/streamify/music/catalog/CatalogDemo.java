package com.streamify.music.catalog;

import com.streamify.music.model.Song;
import com.streamify.music.utils.SongPrinter;

public class CatalogDemo {
    static void main(){
        Song song= new Song("Binding Lights",1200);
        song.printSummary();
        SongPrinter.printGenre(song);
    }
}
