package com.javaex.ex13;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Friend[] friendArray = new Friend[3];
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("친구 3명을 등록해 주세요");
		
		
		
		for(int i=0; i<3; i++) {
			
			//이름
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			//핸드폰
			System.out.print("핸드폰: ");
			String hp = sc.nextLine();
			
			//이름
			System.out.print("학교: ");
			String school = sc.nextLine();
			
			Friend fr = new Friend();
			fr.setName(name);
			fr.setHp(hp);
			fr.setSchool(school);
			
			friendArray[i] = fr;
			
		}
		
		for(int i=0; i<friendArray.length; i++) {
			friendArray[i].showInfo();
		}
		
		
		
		sc.close();

	}

}
