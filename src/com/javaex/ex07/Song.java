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
	
	public Song() {};
	
	
	
	//생성자 2 (title/track)
	
	public Song(String title, int track) {
		this.title = title;

		// track에 0이나 -값이 들어가지 않는경우	
		if(track<1) { // 복잡한 로직이 있을수 있음  
			this.track = 0;
		}else {
			this.track = track;
		}
		System.out.println("생성자(2)");
	}
	
	//생성자 6
	
	public Song(String title, String artist, String album,String composer, int year, int track) {
		
		//추가작업 초기값 대입
		this(title,track); //다른 생성자를 호출한다. (사용한다)
		
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		System.out.println("생성자(6)");
	}
	
	//생성자 2 (title/artist)
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	
	
	//생성자 2 (title/composer)
	
	//public Song(String title, String composer) {
	//	this.title = title;
	//	this.composer = composer;
	//}

	
	
	//메소드 - getter / setter
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	//artist
	
	public void setArt(String artist) {
		this.artist = artist;
	}
	
	public String getArt() {
		return artist;
	}
	
	//album
	
	public void setAlb(String album) {
		this.album = album;
	}
	
	public String getAlb() {
		return album;
	}
	
	//composer
	
	public void setCom(String composer) {
		this.composer = composer;
	}
	
	public String getCom() {
		return composer;
	}

	
	//year
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	//track
	
	public void setTrack(int track) {
		this.track = track;
	}
		
	public int getTrack() {
		return track;
	}

	//메소드 - 일반메소드 showInfo()
	
	public void showInfo() {
		System.out.println(artist+", "+ title + "( " +album+", "+ year + ", " + track +"번 track, " + composer + " 작곡 )" );
	}
	//메소드 - 일반메소드 toString() <--테스트

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
}
