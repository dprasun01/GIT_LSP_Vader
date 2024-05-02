package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SongsDatabaseTest {
    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        db.addSong("Pop", "Hymn For The Weekend");
        db.addSong("Rock", "Sweet Child 'O Mine");
        db.addSong("Soft Rock", "Numb");
        db.addSong("Pop", "Baby");
        db.addSong("Pop", "Heat Waves");
        db.addSong("Rap", "Gin and Juice");
        Set<String> songs = db.getSongs("Pop");
        assertTrue(songs.containsAll(Arrays.asList("Hymn For The Weekend", "Baby", "Heat Waves")));
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        db.addSong("Pop", "Hymn For The Weekend");
        db.addSong("Rock", "Sweet Child 'O Mine");
        db.addSong("Soft Rock", "Numb");
        db.addSong("Pop", "Baby");
        db.addSong("Pop", "Heat Waves");
        db.addSong("Rap", "Gin and Juice");
        Set<String> songs = db.getSongs("Pop");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        db.addSong("Pop", "Hymn For The Weekend");
        db.addSong("Rock", "Sweet Child 'O Mine");
        db.addSong("Soft Rock", "Numb");
        db.addSong("Pop", "Baby");
        db.addSong("Pop", "Heat Waves");
        db.addSong("Rap", "Gin and Juice");
        Set<String> songs = db.getSongs("Rap");
        assertEquals(2, songs.size());
        assertTrue(songs.contains("Savage"));
        assertTrue(songs.contains("Gin and Juice"));
    }
}