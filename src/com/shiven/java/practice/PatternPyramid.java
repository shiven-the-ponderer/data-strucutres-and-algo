package com.shiven.java.practice;

public class PatternPyramid {
	
	public static void printPattern(int n) {
		int i=1;
		while(i<=n) {
			/*while((2*n-i)/2<=i || i<=(2*n+i)/2) {
				System.out.print("*");
			}
			while(i<=(2*n-i)/2) {
				System.out.print(" ");
			}*/
			
			int j;
			for( j=1;j<=(2*n-i)/2;j++) {
				System.out.print(" ");
			}
			for(;j>=(2*n-i)/2 && j<=(2*n+i)/2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			i++;
			
	    }
	}
	
	public static void main(String[] args) {
		PatternPyramid.printPattern(5);
		System.out.println("i m here");
	}

}
