package com.example.moodmusic;

public class Song {
    private String title;
    private String artist;
    private String genre;

    Song(String title, String artist, String genre) {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
