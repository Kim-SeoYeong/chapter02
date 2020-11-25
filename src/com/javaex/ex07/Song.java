package com.javaex.ex07;

public class Song {
	//필드 6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	//생성자 0
	public Song() {}
	//생성자 2 : 타이틀, 아티스트
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	//생성자 2 : 타이틀, 작곡가==> 이건 에러임 확인만해보기
	//생성자 2 : 타이틀, 트랙번호 -> 만들수 있는지 확인
	public Song(String title, int track) {
		//메모리에 올린다.
		//추가작업 --> 초기값 대입
		this.title = title;
		//this.track = track;
		
		if(track < 1) {	//이렇게되면 굉장히 복잡한 로직이 추가될 수 있음.
			this.track = 0;
		} else {
			this.track = track;
		}
		
		System.out.println("생성자(2)");
	}
	//생성자 6
	public Song(String title, String artist, String album, String composer, int year, int track) {
		//this.title = title;
		this(title, track); //다른 생성자를 호출한다.(사용한다)
		//this(title, track)을 쓰는 이유는 안그러면 if문이 계속 반복적으로
		//사용되야하기 때문에 중복을 최소화시키기 위해서
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		System.out.println("생성자(6)");
	}
	
	//메소드 - getter/setter
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	//메소드 - 일반메소드(showInfo())
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", "
							+ track + "번 track, " + composer + " 작곡 )");
	}
	//메소드 - 일반메소드(toString()) <--테스트용
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
}
