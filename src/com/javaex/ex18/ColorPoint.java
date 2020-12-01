package com.javaex.ex18;

public class ColorPoint extends Point {
	
	
	//필드
	private String color;

	//생성자
	
	public ColorPoint() {}

	public ColorPoint(String color) {
		this.color = color;
	}

	protected ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	//메소드  getter setter
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//일반메소드
	

	public void showInfo() { //부모 클래스의 showInfo와 변수명 동일
		System.out.println("x:  " + x + "  y: " + y +"  color: " + color);
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY()
				+ "]";
	}
	
	
	
	
	
	
	
}
