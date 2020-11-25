package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(22);
		p1.drow();
		
		Point p2 = new Point(77,5);
		p2.drow();
		
		Point p3 = new Point(6);
		p3.setY(38);
		p3.drow();		

	}

}
