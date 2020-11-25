package com.javaex.ex09_1;

public class TV {
	
	//필드
	
		private int channel;
		private int volume;
		private boolean power;

		//생산자 --> void 넣지말자
		
		public TV() {}  
		
		public TV(int channel, int volume, boolean power){
			this.channel = channel;
			this.volume = volume;
			this.power = power;	
		}

		
		
		//메소드 - getter만 작성
		
		
		public int getChannel() {
			return channel;
		}


		public int getVolume() {
			return volume;
		}


		public boolean getPower() {
			return power;
		}

		// 일반 메소드
		
		//void power( boolean on ) 메소드 구현

		public void power(boolean on) {
			if(on==true) {
				this.power = true;
				
			}else {
				this.power = false;
			}
		}
		
		//void channel( int channel ) 메소드 구현 (1~255 유지)  -> 1보다 작을땐 1 , 255보다 클떈 255

		public void channel(int channel) {
			if(1>channel) {
				this.channel = 1;
			}else if(255<channel){
				this.channel = 255;
			}else { //channel값 변동없음
				this.channel = channel;
			}
		}
		
		//void channel( boolean up ) 메소드 오버로딩 (1~255 유지, 1씩 증감 // down 으로 따로 빼는방법은?)

		public void channel(boolean up) {
			if(up == true) {
				if(channel == 255) {
					this.channel = 255; //255 일때는 증가 안됨
				}else{
					this.channel++;
				}
			}else {
				if(channel == 1) { 
					this.channel = 1; //1 일때는 감소 안됨
				}else {
					this.channel--;
				}
			}
		}
		
		//void volume( int voluem ) 메소드 구현  ( 0 ~ 100 유지 )
		
		public void volume(int volume) {
			if(volume <0) { 
				this.volume = 0; //0보다 내려갈 수 없음
			}else if(volume >100){
				this.volume = 100; // 100보다 올라갈 수 없음
			}else { //0~100 인경우
				this.volume = volume;
			}
		}
		
		//void volume( boolean up ) 메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
		
		public void volume(boolean up) {
			if(up == true) {
				if(volume == 100) { 
					this.volume = 100;  //100보다 올라갈 수 없음
				}else{
					this.volume++;
				}
			}else{
				if(volume == 0) {
					this.volume = 0; //100보다 내려갈 수 없음
				}else {
					this.volume--;
				}
			}
		}
		
		//void status() 메소드 구현( TV 정보 출력) 
		
		public void status(){
			
			System.out.println("tv전원 :" + power +"  볼륨 :" + volume+ "  채널 :" + channel );
		}

		@Override
		public String toString() {
			return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
		}

}
