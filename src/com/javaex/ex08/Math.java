package com.javaex.ex08;


//메소드 오버로드 예제

public class Math {
	
	//필드 --> 생략가능, 코드작성안함
	//생성자
	public Math() {} //생략가능
	
	//메소드 - getter , setter 생략
	
	//메소드 - 일반
	
	public static int plus(int a, int b) {
		
		int sum = a+b; //복잡한 로직이라고 가정
		return sum;
	}
	
	public static double plus(double a,double b) {
		
		double sum = a+b;
		return sum;
	}
	
	

}
