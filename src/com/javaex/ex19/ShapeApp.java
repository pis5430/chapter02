package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		//사각형 테스트
		/*
		Ractangle r01 = new Ractangle("빨강","노랑",5,10);
		Ractangle r02 = new Ractangle("빨강","파랑",20,30);
		Ractangle r03 = new Ractangle("빨강","초록",100,100);
		
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
		//배열 적용
		
		Ractangle[] rArray = new Ractangle[5];
		
		Ractangle r01 = new Ractangle("빨강","노랑",5,10);
		Ractangle r02 = new Ractangle("빨강","파랑",20,30);
		Ractangle r03 = new Ractangle("빨강","초록",100,100);

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i=0; i<rArray.length; i++ ) {
			rArray[i].draw();
		}
		
		
		
		Circle c01 = new Circle("노랑","파랑",100);
		
	}

}
