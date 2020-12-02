package com.javaex.ex21;

public class Circle extends Shape {
	

	//필드
	private int radius;

	
	//생산자
	public Circle() {
		super();
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	
	//메소드 getter setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//일반메소드
	
	public void draw() {
		System.out.println("원 - 면색:" + super.getFillColor()+ "  선색:" + super.getLineColor()+ "  반지름:" + radius);
	}
	
	public void area() {
		System.out.println("원의 면적:" + (3.14*radius*radius)); 
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
	

	
	
	
	
	
	
	
	
	
	
	

	

}
