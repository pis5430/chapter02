package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		
		
		//m01 t
		Song m01 = new Song();
		
		m01.setTitle("좋은날");
		m01.setArt("아이유");
		m01.setAlb("Real");
		m01.setCom("이민수");
		m01.setYear(2010);
		m01.setTrack(3);
		
		System.out.println(m01.toString());
		m01.showInfo();
		
		
		//m02
		System.out.println("=============");
		Song m02 = new Song("거짓말","빅뱅","Always","지드래곤", 2007, 2);

		System.out.println(m02.toString());
		m02.showInfo();
		System.out.println("=============");
		
		//m03
		Song m03 = new Song("벚꽃엔딩","버스커버스커");
		
		m03.setAlb("버스커버스커1집");
		m03.setCom("장범준");
		m03.setYear(2012);
		m03.setTrack(4);

		System.out.println(m03.toString());
		m03.showInfo();
		
		//m04
//		Song m04 = new Song("벚꽃엔딩","장범준");
//		
//		m04.setArt("버스커버스커");
//		m04.setAlb("버스커버스커1집");
//		m04.setYear(2012);
//		m04.setTrack(4);

//		System.out.println(m04.toString());
//		m04.showInfo();
		
		
		//m05
		Song m05 = new Song("벚꽃엔딩",4);
		
		m05.setArt("버스커버스커");
		m05.setAlb("버스커버스커1집");
		m05.setCom("장범준");
		m05.setYear(2012);

		System.out.println(m05.toString());
		m05.showInfo();
		

	}

}
