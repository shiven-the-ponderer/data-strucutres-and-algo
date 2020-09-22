package com.shiven.javaeight.features;

public class FactorialDemo {
	
	public int calculateFact(int number){
		int product = 0;
		if(number==0){
			return 1;
		}
		else if(number==1){
			return 1;
		}
		else{
			return  number*calculateFact(number-1);
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new FactorialDemo().calculateFact(0));
		
		LambdaDemo lambdaDemo = ()-> {
				System.out.println("i am playing");
				
			};
		
		
		lambdaDemo.play();
	}
}
