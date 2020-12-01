package com.javaex.ex17;

public class Student extends Person {

	//필드
	private String schoolName;

	
	//생성자
	public Student() {}

	public Student(String name , int age ,String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	//메소드 getter setter

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//일반메소드
	
	//부모클래스에서 같은 showInfo가 잇는 경우 자손에 있는것을 가져다 쓴다.
	
	public void showInfo() {
		System.out.println("이름: "+ super.getName() + "   나이: " + super.getAge()+"   학교: " + schoolName);
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + super.getName() +", age=" +  super.getAge() + "]";
	}
	
	

	
	
	
	
	

}
