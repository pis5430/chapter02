package com.javaex.ex06;

public class Point {
	
	//필드
	private int x;
	private int y;

	
	//생성자
	
	public Point() {}	
	
	public Point(int x , int y) {
		this.x=x;
		this.y=y;
	}
	
	//getter, setter 메소드

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
	
	//메소드 일반메소드
	public void draw() {
		System.out.println("점[x="+ x + ", y="+y+"]을 그렸습니다.");
	}
	
	public void draw(boolean opt) {
		if(opt == true) {
			System.out.println("점[x="+ x + ", y="+y+"]을 그렸습니다.");
		}else {
			System.out.println("점[x="+ x + ", y="+y+"]을 지웠습니다.");
		}
	}
	

	@Override  //왠만하면 필수로 만듬. 값이 제대로 들어가는지 테스트용
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
