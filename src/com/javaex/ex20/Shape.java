package com.javaex.ex20;

public abstract class Shape {
	
	
	//필드
	private String fillColor;
	private String lineColor;

	
	//생성자
	public Shape() {}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
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

	
	//일반메소드
	//draw()없음 - 단독적으로 메모리에 올라갈수 없는 경우(일반화클래스)
	//오버라이딩 때문에 껍데기만 만들어 둘 수 도있음 내용은 필요없어서 {} 생략
	public abstract void draw();
	public abstract double area();
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
	
	
	

}
