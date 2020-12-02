package com.javaex.ex19;

public class Ractangle {
	
	//필드
	
	private String fillColor;
	private String lineColor;
	private int widht;
	private int height;

	
	//생성자
	public Ractangle() {}

	public Ractangle(String fillColor, String lineColor, int widht, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.widht = widht;
		this.height = height;
	}

	
	//메소드 getter setter
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//일반메소드
	
	public void draw() {
		System.out.println("사각형-면색:" + fillColor + "  선색:" +lineColor + "  가로:" +widht + "  세로:" + height );
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Ractangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", widht=" + widht + ", height="
				+ height + "]";
	}
	
	
	
	

}
