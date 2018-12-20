package songbook.data;

import java.util.List;

/**
 * Created by pwilkin on 13-Dec-18.
 */
public class Album {

    protected List<Song> songs;
    protected String name;

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void printSongs() {
    	for (Song song : songs) {
        	System.out.println("Album: " + name);
    		System.out.println("\nSong title: " + song.getTitle() + "\n" + song.getLyrics());
    		
    	}
    }
}
