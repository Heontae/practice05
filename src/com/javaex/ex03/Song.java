package com.javaex.ex03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// 생성자
	public Song() {
		System.out.println("Song(피라미터0개)");
	}

	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(피라미터5개)");
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year); // 16번줄 5개짜리 생성자 상속?
		this.track = track;
		System.out.println("Song(피라미터6개)");
	}

	// g/s
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

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// to String
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
