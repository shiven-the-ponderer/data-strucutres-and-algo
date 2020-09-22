package com.shiven.javaeight.features;

public class LambdaOperatorBasic {
	
	public static void main(String[] args) {
		
		int width = 10;
		
		Drawable drawable = new Drawable(){
			public void draw(){
				System.out.println("Drawing "+width);
			}
		};
		
		drawable.draw();
		
		Drawable d2 = ()->{
			System.out.println("Drawing" +width);
		};
		d2.draw();
		
		Drawable d3 = ()->System.out.println("Drawing" +width);
		d3.draw();
	}

}
