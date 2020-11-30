package com.javaex.ex15;

public class ColorPoint extends Point{
	
	
	private String color;

	public ColorPoint() {
		System.out.println("ColorPoint(0)");
		//super();
	}

	public ColorPoint(String color) {
		super();
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	
	
	public ColorPoint(int x, int y) {
		super(x,y);
		System.out.println("ColorPoint(2)");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
		System.out.println("ColorPoint()");
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
		System.out.println("[x=" + x + ", y=" + y + " color=" +color + "]"); //x와 y는 부모에서 protected 로 바꿔줘야 변수 그대로 쓸수 있음
	}
	
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	

	
	


	
	
	

}
