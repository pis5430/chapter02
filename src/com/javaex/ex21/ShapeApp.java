package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		
		//Shape 불러오기 테스트 --> 오류발생
		//Shape s1 = new Shape("초록","파랑");
		
		//Circle 불러오기 테스트 
		Circle c1 = new Circle("초록","파랑",100);
		c1.draw();
		c1.area();
		
		//Tringle 불러오기 테스트
		Tringle t1 = new Tringle("초록","파랑",100,100);
		t1.draw();
		t1.area();
		
		//Tringle 불러오기 테스트
		Ractangle r1 = new Ractangle("노랑","주뢍",2,5);
		r1.draw();
		r1.area();
		
		*/
		
		
		//배열 적용하기
		
		Shape[] sArray = new Shape[6]; 
		
		Shape c1 = new Circle("연두","파랑",50);
		Shape c2 = new Circle("노랑","검정",50);
		
		Shape t1 = new Tringle("연두","파랑",50,100);
		Shape t2 = new Tringle("노랑","검정",50,200);
		
		Shape r1 = new Ractangle("빨강","흰색",7,50);
		Shape r2 = new Ractangle("보라","핑크",30,25);
		
		
		sArray[0] = c1;
		sArray[1] = c2;
		sArray[2] = t1;
		sArray[3] = t2;
		sArray[4] = r1;
		sArray[5] = r2;
		
		
		//반복문
		
		for(int i =0; i<sArray.length; i++) {
			sArray[i].draw();
			sArray[i].area();
			System.out.println("==============");
		}
		
	}

}
