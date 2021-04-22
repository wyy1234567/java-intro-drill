import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


public class Playlist {

    public String name;
    public ArrayList<Song> playlist;

    public Playlist(String newName) {
        this.name = newName;
        this.playlist = new ArrayList<Song>();
    }

    public boolean isEmpty() {
        return this.playlist.size() == 0;
    }

    public void addSong(Song newSong) {
        playlist.add(newSong);
    }

    public String[] songNames() {
        int currSize = this.playlist.size();
        String[] songNames = new String[currSize];

        for (int i = 0; i < currSize; i++) {
            songNames[i] = this.playlist.get(i).title;
        }

        return songNames;
    }

    public int totalDuration() {
        int duration = 0;

        for (Song i : playlist) {
            duration += i.durationInSeconds;
        }

        return duration;
    }

    public void swap(Song song1, Song song2) {
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < playlist.size(); i++) {
            Song curr = playlist.get(i);
            if (curr == song1) {
                index1 = i;
            }else if (curr == song2) {
                index2 = i;
            }
        }

        Collections.swap(playlist, index1, index2);
    }

    public void removeSong(Song song) {
        playlist.remove(song);
    }
}
