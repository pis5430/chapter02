package com.javaex.ex20;

public class Tringle extends Shape{
	
	
	//필드
	private int width;
	private int height;

	
	//생성자
	public Tringle() {
		super();
	}

	public Tringle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}



	//메소드 getter setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//일반메서드
	
	public void draw() {
		System.out.println("삼각형 - 면색:" + super.getFillColor() + "  선색:" + super.getLineColor()+ "  가로:" + width + "  세로:" + height );
	}
	
	public double area() {
		return 1/2*width*height;
	}
	
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	

	
	
	
	
}
