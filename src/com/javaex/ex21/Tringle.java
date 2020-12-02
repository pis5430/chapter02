package com.javaex.ex21;

public class Tringle extends Shape {
	
		
		//필드
		private int width;
		private int height;
	
		
		//생성자
		public Tringle() {
			super();
		}
	
		public Tringle(String fillColor, String lineColor, int width, int height) {
			super(fillColor, lineColor);
			this.width = width;
			this.height = height;
		}
		
		//메소드 getter setter
	
		public int getWidth() {
			return width;
		}
	
		public void setWidth(int width) {
			this.width = width;
		}
	
		public int getHeight() {
			return height;
		}
	
		public void setHeight(int height) {
			this.height = height;
		}
	
		
		//일반메소드
		
		public void draw() {
			System.out.println("삼각형 - 면색:" + super.getFillColor()+ "  선색:" + super.getLineColor()+ "  가로:" + width + "  세로:" +height);
		}
		
		public void area() {
			System.out.println("삼각형의 면적:" + width*height/2);
		}
		
		@Override
		public String toString() {
			return "Tringle [width=" + width + ", height=" + height + "]";
		}
		
		
		
		
	
	
	
	

}
