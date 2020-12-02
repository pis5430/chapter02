package com.javaex.ex20;

public class Ractangle extends Shape  {
	
	
	//필드
	private int width;
	private int height;

	
	//생성자
	public Ractangle() {
		super();
	}

	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

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

	
	//일반메소드
	
	public void draw () {
		System.out.println("사각형- 면색:" + super.getFillColor()+"  선색:" + super.getLineColor()+ "  가로:" + width + "  세로:" + height);
	}
	
	public double area() {//사각형 면적구하기
		//double area = width * height;
		return width*height;
	}
	
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	

}
