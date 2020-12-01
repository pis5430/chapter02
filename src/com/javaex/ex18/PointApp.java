package com.javaex.ex18;

public class PointApp {

	public static void main(String[] args) {
		//ex 17번과 같이 메소드 오버라이딩 
		// 메소드 섞어쓰기
		// 업캐스팅
		//다운캐스팅이 적용된 문제로 수정하기
		
		// 제일 상위 클래스 (Point)
		
		
		Point pcArray[] = new Point[6]; //배열 개수 선언
		
		
		// 배열안에 들어갈 변수 선언
		Point p01 = new Point(1,1);
		Point p02 = new Point(2,2);
		Point p03 = new Point(3,3);
		
		Point c01 = new ColorPoint(4,4,"green");
		Point c02 = new ColorPoint(5,5,"blue");
		Point c03 = new ColorPoint(5,5,"ged");
		
		//배열안에 변수 집어넣기
		pcArray[0] = p01;
		pcArray[1] = p02;
		pcArray[2] = p03;
		pcArray[3] = c01;
		pcArray[4] = c02;
		pcArray[5] = c03;
		
		
		for(int i=0; i <pcArray.length; i++) {
			pcArray[i].showInfo();
			}
		
		for(int i=0; i <pcArray.length; i++) {
			System.out.println(pcArray[i].toString());
			}
		
		//Point 클래스로 통일 -- 부모 클래스
		
		Point t01 = pcArray[0]; //-->  같은 클래스
		Point t02 = pcArray[3]; //pcArray[3]은 원래 ColorPoint지만 Point에 넣어져있음
		// ColorPoint t03 = pcArray[5]; // --> pcArray[5]은 원래 ColorPoint지만 Point에 넣어져있음
		ColorPoint t04 = (ColorPoint)pcArray[5]; // 다운캐스팅 --> Point에 넣어졌던것을 명시적으로 타입변환해줌
		
		
		//배열 내용 변경하기
		
		pcArray[4].setX(22);
		pcArray[4].setY(25);
		((ColorPoint)pcArray[4]).setColor("pink");
		
		// pcArray[4] 내용 변경 확인하기 
		
		for(int i=0; i <pcArray.length; i++) {
			pcArray[i].showInfo();
			}
		
	}

}
