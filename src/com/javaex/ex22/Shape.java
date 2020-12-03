package com.javaex.ex22;

public abstract class Shape { //abstract를 추가함으로써 Shape클래스 자체를 불러오면 오류가남
	// Shape 모형은 나머지 도형들을 담는 카테고리 개념으로써 눈에 보이게 나타낼수 없음
	
	//필드
	
		private String fillColor;
		private String lineColor;

		//생산자
		public Shape() {}

		public Shape(String fillColor, String lineColor) {
			this.fillColor = fillColor;
			this.lineColor = lineColor;
		}
		
		//메소드 getter setter

		public String getFillColor() {
			return fillColor;
		}

		public void setFillColor(String fillColor) {
			this.fillColor = fillColor;
		}

		public String getLineColor() {
			return lineColor;
		}

		public void setLineColor(String lineColor) {
			this.lineColor = lineColor;
		}

		//일반메소드
		//draw 생성불가 하지만 메소드 오버로드 하기 위해선 껍데기가 필요
		
		//public abstract void draw(); //속성값을 보여주는 메소드 --> 인터페이스 Drawable 개념을 이동
		public abstract void area(); //도형의 면적을 계산해주는 메소드
		
		@Override
		public String toString() {
			return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
		}

}
