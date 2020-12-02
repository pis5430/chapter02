package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		//테스트
		
		Ractangle r01 = new Ractangle("빨강","연두",50,22);
		r01.draw();
		
		Circle c01 = new Circle("초록","파랑",100);
		c01.draw();
		
		Tringle t01 = new Tringle("노랑","핑크",50,30);
		t01.draw();
		
		//문제발생 (문법상으로는 맞지만 개념적으로는 되면안되는)
		//추상클래스 --> 부모클래스에 abstract 추가
		//Shape s01 = new Shape("하늘","연두");
		//s01.draw();
		
		
		Shape[] sArray = new Shape[3];
		
		Shape sr01 = new Ractangle("빨강","연두",50,22);
		Shape sc01 = new Circle("초록","파랑",100);
		Shape st01 = new Tringle("노랑","핑크",50,30);
		
		sArray[0] = sr01; 
		sArray[1] = sc01; 
		sArray[2] = st01; 
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
	}

}
