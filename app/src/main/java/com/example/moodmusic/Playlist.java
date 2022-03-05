package com.example.moodmusic;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    private String URL;
    private ArrayList<Song> playlist;

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Song> p) {
        this.playlist = p;
    }

    public void obtainPlaylist(String moodQuery) {
        setURL(moodQuery);

        // MAKE URL CONNECTION
        URLConnection connection = null;
        try {
            connection = new URL(getURL()).openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // RETRIEVE DATA FROM CONNECTION
        connection.addRequestProperty("Accept-Charset", "UTF-8");
        InputStream response = null;
        try {
            response = connection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String responseBody = null;
        try (Scanner scanner = new Scanner(response)) {
            responseBody = scanner.useDelimiter("\\A").next();
        }

        // TURN RESPONSE INTO OBJECT
        Gson gson = new Gson();
        // TODO: PARSE RESPONSE TO OBJECT
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String query) {
        this.URL = "https://api.spotify.com/v1/search?q="+ query +"type=playlist";
    }

}
