package com.javaex.ex24;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		
		//사용하는 입장에서 사용법
		//상황1
		
		MyFile mf = new MyFile();
		
		try {
			String str = mf.fileRead("c:/javaStudy/test.txt");
			System.out.println(str);
		}catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		//상황2
		
		//MyFile mf2 = new MyFile();
		//String str2 = mf2.fileRead2("c:/javaStudy/test.txt");
		//System.out.println(str2);
		
		//상황3
		
		MyFile mf2 = new MyFile();
		
		try {
			String str2 = mf2.fileRead2("c:/javaStudy/test.txt");
			System.out.println(str2);
		}catch (IOException e){
			System.out.println("파일이 없습니다.");
		}
	}

}
