package com.javaex.ex23;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		//0을 넣는 경우 비정상적인 종료 (수학적으로 맞지 않기 때문에)
		/*
		double sum = 100 / num;
		System.out.println(sum);
		*/
		
		// 예외처리 
		
		try { //정상적인 경우 실행
			double sum = 100 / num;
			System.out.println(sum);
			
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌수 없습니다.");
		}catch(NullPointerException e) {
			System.out.println("널포인트");
		}

		
		sc.close();

	}

}
