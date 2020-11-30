package com.javaex.ex14;

public class Student extends Person{
	
	//필드
	
	private String schoolName;

	//생성자
	
	public Student() { // 생성자가 다른 경우가 생기면 디폴트 생성자는 사라지기 때문에 생략하면 안된다
		System.out.println("Student()");
		
		
	}
	
	public Student(String schoolName) {
		//Person(); -->super(); 부모쪽 디폴트 생성자 실행
		super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	
	
	public Student(String name, int age, String schoolName) {
		//1.자신의 생성자 실행 --> 완료 x
		//2.부모의 생성자 호출
		//  - 부모의 생성자를 선택할 수 있다.
		//  - 선택하지 않으면 디폴터 생성자가 실행된다. 
		//3. 부모의 생성자 작업이 끝나면 자신의 생성자 작업을 완료한다.
		
		//*부모 생성자 호출방법
		// 표기 없으면 디폴트 생성자 호출
		// 선택을 하면 선택한 생성자 호출
		// super(파라미터) <-- 이런식으로 표기함
		
		super(name,age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	//메소드 getter, setter
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schollName) {
		this.schoolName = schollName;
	}

	
	
	//일반메소드
	
	public void showInfo() {
	//	System.out.println(schoolName);
	//	System.out.println(super.getName());
	//	System.out.println(super.getAge());
		
		System.out.println("이름: " + getName()+ " 나이: " + getAge()+ " 학교: " + getSchoolName());
		System.out.println("이름: " + name+ " 나이: " + age+ " 학교: " + schoolName);
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [schollName=" + schoolName + "]";
	}
	
	
	



	
	
	
	
	
	

}
