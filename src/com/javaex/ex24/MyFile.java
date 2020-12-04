package com.javaex.ex24;

import java.io.IOException;

public class MyFile {
	
	//필드
	
	//생성자
	
	//메소드 getter setter
	
	//메소드 일반
	//상황1
	public String fileRead(String path)throws IOException{
		//텍스트 파일을 읽어서 글자를 String으로 리턴해준다
		//복잡한 로직
		//경로에 파일이 있는지 확인하는 로직이 있다.
		throw new IOException();
	}
	
	//상황2
	//public String fileRead2(String path){
		//텍스트 파일을 읽어서 글자를 String으로 리턴해준다
		//복잡한 로직
			//파일 없을경우
	//		try {
	//			throw new IOException(); //파일을 못찾은 경우
	//		}catch(IOException e) {
				//예외상황이 발생은 인지
				//처리방벙은 결정할 수 없다. 사용하는 쪽에서 결정해야된다.
	//			System.out.println("파일오류");
	//		}
	//		return "안녕하세요";
	
	//상황3
	public String fileRead2(String path)throws IOException{
		//텍스트 파일을 읽어서 글자를 String으로 리턴해준다
		//복잡한 로직
			//파일 없을경우
			
				throw new IOException(); //파일을 못찾은 경우
			
				//예외상황이 발생은 인지
				//처리방벙은 결정할 수 없다. 사용하는 쪽에서 결정해야된다.
				
		
	
	
	}
}
