package com.javaex.ex01;

public class Goods {
	
	//필드  (재료에 비유)
	
	private String name;
	private int price;
	
	//생성자
	//메소드 - 겟터/새터
	
	//메소드 - 일반
	// setName() 이름등록
	
	public void setName(String n) { //void 자료형이 들어가는 자리 , 자료형이 없을땐 void
		name = n; // "니콘" "lg그램" "머그컵"
		//return 생략가능 리턴이 있을때 자료형 (ex:int) 표기)
 	}
	
	// getName() 이름읽기
	
	public String getName() { //()안에 아무것도 안넣음, 불러와야 하기 때문에
		return name;
	}
	
	// setPrice() 가격등록
	
	public void setPrice(int p) {
		price = p;
	}
	
	// getPrice() 가격읽기
	public int getPrice() {
		return price;
	}
	
	
}
