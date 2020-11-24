package com.javaex.ex03;

public class Song {
	private String title, artist, album, composer;
	private int year, track;
	
	//생성자
	//메소드 유사하다 이름은 클래스명, 리턴형이 없다
	public Song() {
		//메모리에 올리는걸 해주는 역할
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		//메모리에 코드를 올린다.
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public int getTrack() {
		return track;
	}
	
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", "
							+ track + "번 track, " + composer + " 작곡 )");
	}
	
	
}
