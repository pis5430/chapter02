package com.javaex.ex15;

public class ColorPoint extends Point{
	
	
	private String color;

	public ColorPoint() {
		super();
	}

	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	
	public ColorPoint(int x, int y) {
		super(x,y);
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	//메소드 getter, setter

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	//일반메소드
	
	
	
	public void showInfo() {
		System.out.println("[x=" + x + ", y=" + y + " color=" +color + "]");
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	

	
	


	
	
	

}
