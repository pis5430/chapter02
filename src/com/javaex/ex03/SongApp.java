package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		
		//아이유앨범
		
		Song s01 = new Song();
		
		s01.setTitle("좋은날");		
		s01.setArt("아이유");
		s01.setAlb("Real");
		s01.setCom("이민수");
		s01.setYear(2010);
		s01.setTrack(3);
		
		s01.showInfo();
		
		//(artist+", "+ title + "( " +album+", "+ year + ", " + track +"track, " + composer + " 작곡 )" );

		//빅뱅앨범
		
		Song s02 = new Song("거짓말", "빅뱅", "always", "G_DRAGON", 2007,2);
		
		/*
		s02.setTitle("거짓말");
		s02.setArt("BIGBANG");
		s02.setAlb("Always");
		s02.setCom("G-DRAGON");
		s02.setYear(2007);
		s02.setTrack(2);
		*/
		
		s02.showInfo();
		
		//버스커버스커앨범
		
		Song s03 = new Song("벚꼿엔딩", "버스커버스커", "버스커버스커1집","장범준" , 2012, 4);
		/*
		 
		s03.setTitle("벚꽃엔딩");
		s03.setArt("버스커버스커");
		s03.setAlb("버스커버스커1집");
		s03.setCom("장범준");
		s03.setYear(2012);
		s03.setTrack(4);

		*/
		s03.showInfo();
		
	}

}
