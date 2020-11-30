package com.javaex.ex14;

public class Student {
	
	//필드
	
	private String schollName;

	//생성자
	
	public Student() {
		super();
	}
	
	public Student(String schollName) {
		super();
		this.schollName = schollName;
	}

	
	//메소드 getter, setter
	
	public String getSchollName() {
		return schollName;
	}

	public void setSchollName(String schollName) {
		this.schollName = schollName;
	}

	
	
	//일반메소드
	
	@Override
	public String toString() {
		return "Student [schollName=" + schollName + "]";
	}
	
	
	



	
	
	
	
	
	

}
