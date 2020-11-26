package com.javaex.ex11;

public class MaMathApp {

	public static void main(String[] args) {
		// 메모리 스토리
		
		int sum = MyMath.plus(3,5);
		System.out.println(sum);
		
		double sum01 = MyMath.plus(3123.4,543.2);
		System.out.println(sum01);
		
		int sum02 = minus(100,10);
		System.out.println(sum02);
		
	}
	
	//메소드
	
	public static int minus(int a, int b) {
		return a-b;
	}

}
