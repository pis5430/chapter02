package com.javaex.ex09;

public class TVApp {

	public static void main(String[] args) {
		
		
		TV tv = new TV(7,20,false);
		
		// 기본값↑
        tv.status();	
        
        
        // 전원킴, 소리볼륨 120 -->100 , 채널 변동없음
        tv.power( true );
        tv.volume( 120 );
        tv.status();		          
        
        
        // 전원 변동없음, 소리볼륨 -1 , 채널 변동없음
        tv.volume( false );
        tv.status();

        
        // 전원 변동없음, 소리 변동없음 , 채널 0 -->1 (채널 0없음)
        tv.channel( 0 );
        tv.status();		          
        
        
        // 전원 변동없음, 소리 변동없음 , 채널 +1+1+1
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();
        
        // 전원 끔, 소리 변동없음 , 채널 변동없음
        tv.power( false );
        tv.status();      
		

	}

}
