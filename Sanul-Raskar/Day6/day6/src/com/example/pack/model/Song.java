package com.example.pack.model;

public class Song {
	private String title;
	private String album;
	private String artist;
	private String genre;

	public Song(String title, String album, String artist, String genre) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
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

	@Override
	public String toString() {
		return "Song [title=" + title + ", album=" + album + ", artist=" + artist + ", genre=" + genre + "]";
	}

}
