package com.javaex.ex02;

public class Point {
	
	
	//캡슐화
	private int x;
	private int y;
	
	
	//x setter
	
	public void setterX(int x) {
		this.x = x;
	}
	
	//x getter
	
	public int getterX() {
		return x;
	}
	
	
	//y setter
	
	public void setterY(int y) {
		this.y = y;
	}
	
	//x getter
	
	public int getterY() {
		return y;
	}
	
	public void drow() {
		System.out.println("점[x=" + x + ", y=" + y +"]을 그렸습니다.");
	}

		
}
