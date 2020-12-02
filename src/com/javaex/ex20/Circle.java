package com.javaex.ex20;

public class Circle extends Shape {
	
	
	//필드
	private int redius;

	//생성자
	public Circle() {
		super();
	}

	public Circle(String fillColor, String lineColor, int redius) {
		super(fillColor, lineColor);
		this.redius = redius;
	}
	
	//메소드 getter setter

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}

	
	
	//일반메소드
	
	public void draw() {
		System.out.println("원 - 면색:" + super.getFillColor()+"  선색:" + super.getLineColor()+ "  반지름:" + redius);
	}
	
	public double area() { //원 면적구하기
		return 3.14*redius*redius;
	}
	
	@Override
	public String toString() {
		return "Circle [redius=" + redius + "]";
	}
	
	
	
	
	
	

}
