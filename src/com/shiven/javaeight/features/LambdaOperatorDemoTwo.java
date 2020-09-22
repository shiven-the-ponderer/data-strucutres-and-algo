package com.shiven.javaeight.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaOperatorDemoTwo {
	
	public int sumAll(List<Integer> numbers, Predicate<Integer> p){
		int total = 0;
		for(int number : numbers){
			if(p.test(number)){
				total = total+number;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(new LambdaOperatorDemoTwo().sumAll(Arrays.asList(12,23,24), a->a%2==0));
	}

}
