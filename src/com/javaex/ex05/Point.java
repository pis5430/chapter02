package com.javaex.ex05;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(int x) {
		this.x=x;
	}
	
	//public Point(int y) { //자료형으로 구분하기 때문에 위에 x변수랑 중복되서 오류남
	//	this.y=y;
	//}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("점[x="+ x + ", y="+y+"]을 그렸습니다.");	
	}

	

}
