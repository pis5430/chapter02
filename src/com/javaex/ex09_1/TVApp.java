package com.javaex.ex09_1;

import com.javaex.ex09.TV;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv = new TV(256,120,false); //

		// 기본값↑
        tv.volume( 120 );
        tv.channel( 256);
		tv.status();

        
		System.out.println(tv.toString());
		System.out.println();
        
        // 전원킴, 소리볼륨 120 -->100 , 채널 변동없음
        tv.power( true );
        tv.volume( false );
        tv.status();	
        
		System.out.println(tv.toString());
		System.out.println();
        
        // 전원킴, 소리볼륨 120 -->100 , 채널 변동없음
        tv.power( true );
        tv.volume( 120 );
        tv.channel( true );
        tv.status();	
        
		System.out.println(tv.toString());
		System.out.println();
        
        
        // 전원 변동없음, 소리볼륨 -1 , 채널 변동없음
        tv.volume( false );
        tv.status();
        
		System.out.println(tv.toString());
		System.out.println();

        
        // 전원 변동없음, 소리 변동없음 , 채널 0 -->1 (채널 0없음)
        tv.channel( 0 );
        tv.status();	
        
		System.out.println(tv.toString());
		System.out.println();
        
        
        // 전원 변동없음, 소리 변동없음 , 채널 +1+1+1
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();
        
        
		System.out.println(tv.toString());
		System.out.println();
        
        // 전원 끔, 소리 변동없음 , 채널 변동없음
        tv.power( false );
        tv.status();   
        
		System.out.println(tv.toString());
		System.out.println();
		


	}

}
