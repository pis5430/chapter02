package com.javaex.ex17;

public class PersonApp {

	public static void main(String[] args) {
		
		//Person 배열관리
		Person[] pArray = new Person[3]; 
		
		Person p01 = new Person("둘리",1230);
		Person p02 = new Person("도우너",111);
		Person p03 = new Person("마이클",222);
		
		pArray[0] = p01; 
		pArray[1] = p02; 
		pArray[2] = p03; 
		
		//p01.showInfo();
		//100명 관리중 --> 현재 배운것중 배열사용
		
		for(int i =0; i<pArray.length; i++) {
			pArray[i].showInfo();
		}
		
		
		////////////////////////////////////////
		
		
		//Student 배열 관리
		Student[] sArray = new Student[2]; 
		
		Student s01 = new Student("유재석",44, "서울고등학교");
		Student s02 = new Student("강호동",47,"경기고등학교");
		
		sArray[0] = s01;
		sArray[1] = s02;
		
		
		for(int i =0; i<sArray.length; i++) {
			sArray[i].showInfo();
		}
		
		
		
		//s01.showInfo(); -->부모쪽 showInfo()가 호출됨
		//s01.showInfo2();  -->자식쪽 showInfo()가 호출됨
		
		//student.showInfo2() -->student.showInfo()  --> 메소드를 같게 만들어준다
		
		//s01.showInfo(); //부모쪽의  showInfo()를 사용할 수 없다.

	}

}
