package com.javaex.ex03;

public class Song {

	private String title; 
	private String artist; 
	private String album; 
	private String composer; 
	private int year; 
	private int track;
	
	//title
	
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
	
		
	// ex ) 아이유, 좋은날 ( Real, 2010, 3번 track, 이민수 작곡 )	
		
	public void showInfo() {
		System.out.println(artist+", "+ title + "( " +album+", "+ year + ", " + track +"번 track, " + composer + " 작곡 )" );
		}
	
	
	
	
}
