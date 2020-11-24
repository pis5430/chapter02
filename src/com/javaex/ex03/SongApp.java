package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song content = new Song();
		
		//아이유앨범
		
		content.setArt("아이유");
		content.setTitle("좋은날");
		content.setAlb("Real");
		content.setYear(2010);
		content.setTrack(3);
		content.setCom("이민수");
		
		content.showInfo();
		
		//(artist+", "+ title + "( " +album+", "+ year + ", " + track +"track, " + composer + " 작곡 )" );

		
		//빅뱅앨범
		
		content.setArt("BIGBANG");
		content.setTitle("거짓말");
		content.setAlb("Always");
		content.setYear(2007);
		content.setTrack(2);
		content.setCom("G-DRAGON");
		
		content.showInfo();
		
		//버스커버스커앨범
		
		content.setArt("버스커버스커");
		content.setTitle("벚꽃엔딩");
		content.setAlb("버스커버스커1집");
		content.setYear(2012);
		content.setTrack(4);
		content.setCom("장범준");
		
		content.showInfo();
		
	}

}
