package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		
		
		
		Point pp =  new Point();  //부모 기본 생성자
		pp.setX(5);
		pp.setY(10);
		pp.showInfo();
		
		System.out.println("====================================");
		
		
		Point p = new Point(4,4); //부모 (int x, int y) 생성자
		p.showInfo();

		System.out.println("====================================");
		
		ColorPoint cp1 = new ColorPoint();  //자손 기본 생성자 (부모생성자 거쳐서 자손생성자 실행)
		cp1.setX(52);
		cp1.setY(77);
		cp1.setColor("gray");
		cp1.showInfo();
		
		
		System.out.println("====================================");
		
		ColorPoint cp1_1 = new ColorPoint("red");  //자손 (Steing Color) 생성자
		cp1_1.showInfo();
		
		System.out.println("====================================");
		
		ColorPoint cp2 = new ColorPoint(10, 10 ,"red");  //자손 (int x, int y, Steing Color) 생성자
		cp2.showInfo();
		
		System.out.println("====================================");
		
		ColorPoint cp3 = new ColorPoint(30, 20);  //ColorPoint 에있는 showInfo에는 color 부분 표기까지 들어잇어서 값이 없이 나옴
		cp3.showInfo();
		cp3.setColor("green");  //--> Color 값을 넣어줌
		cp3.showInfo();			// 다시 showInfo 로 확인시 color값이 들어가있음

	}

}
