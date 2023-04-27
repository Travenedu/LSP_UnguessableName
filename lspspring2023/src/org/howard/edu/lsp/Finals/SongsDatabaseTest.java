package org.howard.edu.lsp.Finals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SongsDatabaseTest {

    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "CORSO");
        db.addSong("Soul", "Intimate friends");

        Set<String> rapSongs = db.getSongs("Rap");
        Set<String> expectedRapSongs = new HashSet<String>();
        expectedRapSongs.add("Savage");
        expectedRapSongs.add("CORSO");
        assertEquals(expectedRapSongs, rapSongs);

        Set<String> jazzSongs = db.getSongs("Soul");
        Set<String> expectedJazzSongs = new HashSet<String>();
        expectedJazzSongs.add("Intimate friends");
        assertEquals(expectedJazzSongs, jazzSongs);
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "CORSO");
        db.addSong("Soul", "Intimate friends");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Rap", db.getGenreOfSong("CORSO"));
        assertEquals("Soul", db.getGenreOfSong("Intimate friends"));
        assertNull(db.getGenreOfSong("Non-existent song"));
    }
}