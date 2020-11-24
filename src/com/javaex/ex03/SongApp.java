package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song songAlbum1 = new Song();
		
		songAlbum1.setTitle("좋은날");
		songAlbum1.setArtist("아이유");
		songAlbum1.setAlbum("Real");
		songAlbum1.setComposer("이민수");
		songAlbum1.setYear(2010);
		songAlbum1.setTrack(3);
		
		songAlbum1.showInfo();
		
		Song songAlbum2 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,2);
		/*
		songAlbum2.setTitle("거짓말");
		songAlbum2.setArtist("BIGBANG");
		songAlbum2.setAlbum("Always");
		songAlbum2.setComposer("G-DRAGON");
		songAlbum2.setYear(2007);
		songAlbum2.setTrack(2);
		*/
		songAlbum2.showInfo();
		Song songAlbum3 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		/*
		songAlbum3.setTitle("벚꽃엔딩");
		songAlbum3.setArtist("버스커버스커");
		songAlbum3.setAlbum("버스커버스커1집");
		songAlbum3.setComposer("장범준");
		songAlbum3.setYear(2012);
		songAlbum3.setTrack(4);
		*/
		songAlbum3.showInfo();
		
	}

}
