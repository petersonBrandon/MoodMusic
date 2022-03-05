package com.example.moodmusic;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> playlist;

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Song> p) {
        this.playlist = p;
    }

    public void obtainPlaylist(String moodQuery) {
        // TODO: Make API call to obtain playlist based on mood
    }

}
