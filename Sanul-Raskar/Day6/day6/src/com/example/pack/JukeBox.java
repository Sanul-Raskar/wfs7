package com.example.pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.example.pack.model.Song;

public class JukeBox {

	private ArrayList<Song> songs = new ArrayList<Song>();

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

	private void readFromFile() {
		File file = new File("songsFile.txt");
		String line;
		try {
			BufferedReader objReader = new BufferedReader(new FileReader(file));
			while ((line = objReader.readLine()) != null) {
				System.out.println(line);
				createMusicList(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void createMusicList(String line) {
		String[] tokens = line.trim().split("/");
		songs.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
	}

	private void startMusic() {
		for(Song s: songs) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		JukeBox obj = new JukeBox();

		obj.readFromFile();
		obj.startMusic();
	}

}
