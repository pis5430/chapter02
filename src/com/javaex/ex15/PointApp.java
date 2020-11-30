package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		
		
		
		
		Point p = new Point(4,4);
		p.showInfo();
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.showInfo();
		
		ColorPoint cp2 = new ColorPoint(10, 10 ,"red");
		cp2.showInfo();
		
		ColorPoint cp3 = new ColorPoint(30, 20);
		cp3.showInfo();

	}

}
