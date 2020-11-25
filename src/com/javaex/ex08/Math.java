package com.javaex.ex08;


//메소드 오버로드 예제

public class Math {
	
	//필드 --> 생략가능, 코드작성안함
	//생성자
	//public Math(){}
	
	public int plus(int a, int b) {
		
		int sum = a+b;
		return sum;
	}
	
	public double plus(double a,double b) {
		
		double sum = a+b;
		return sum;
	}
	

}
