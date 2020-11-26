package com.javaex.ex10;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//값을 공유해야할떄
	private static int totalCount; //staric 전역변수 - 스태틱 영역에 올라감
	
	//생성자
	
	public Goods() {
		totalCount = totalCount +1; //앞에 클래스명 표기
	}
	
	public Goods(String name) {
		this.name = name;
		totalCount = totalCount +1;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		totalCount = totalCount +1;
	}

	
	//메소드 - getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	
	
	//메소드 - 일반메소드
	

	public void showInfo() {
		System.out.println("상품명: " + name + ",  가격: " + price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}


	

	
	
	
	
	
	
}
