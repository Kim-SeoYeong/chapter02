package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 0
		Song song1 = new Song();
		
		song1.setTitle("좋은날");
		song1.setArtist("아이유");
		song1.setAlbum("Real");
		song1.setComposer("이민수");
		song1.setYear(2010);
		song1.setTrack(3);
		
		song1.showInfo();
		System.out.println("==============================================");
		//생성자 6
		Song song2 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,2);

		song2.showInfo();
		System.out.println("==============================================");
		
		//생성자2 --> title, artist
		Song song3 = new Song("벚꽃엔딩", "버스커버스커");

		//song3.setArtist("버스커버스커")
		song3.setAlbum("버스커버스커1집");
		song3.setComposer("장범준");
		song3.setYear(2012);
		song3.setTrack(4);
		
		song3.showInfo();		
		
		//생성자2 --> title, track
		Song song4 = new Song("벚꽃엔딩", 4);

		song4.setArtist("버스커버스커");
		song4.setAlbum("버스커버스커1집");
		song4.setComposer("장범준");
		song4.setYear(2012);

		song4.showInfo();
	}

}
