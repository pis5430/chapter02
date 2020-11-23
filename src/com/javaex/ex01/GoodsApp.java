package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		// 

		
		Goods camera = new Goods();
		
		//캡슐화 때문에 사용 불가
		/*
		camera.name = "니콘";
		camera.price = 400000;
		
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		
		camera.setName("니콘");
		//String name = camera.getName();
		//System.out.println(name);
		
		System.out.println();
		
		
		camera.setPrice(400000);
		int price = camera.getPrice();
		System.out.println(price);

		/*
		
		Goods computer = new Goods();
		
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		
		camera.price = 450000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
	}


}
