package com.shiven.java.practice;

import java.io.*;
import java.util.*;

public class FindMiddleIndex {
	
	public static int findMiddleIndex(int[] numbers) throws Exception {
		
		for(int i=0;i<numbers.length;i++) {
			int endIndex = numbers.length-1;
			int sumBefore = 0;
			int sumAfter = 0;
			
			if(i>0) {
				for(int j=i-1;j>=0;j--) {
					sumBefore+=numbers[j];
				}
			}
			for(int k=i+1;k<numbers.length;k++) {
				sumAfter+= numbers[k];
			}
			if(sumBefore==sumAfter) {
				return i;
			}
			if(i==endIndex) {
				throw new Exception("Not correct input");
			}
		}
		return 0;
	}
	
	public static void main(String[] args)  {
//		int[] numbers = {5,2,7,8,1,4,11,3,2};
//		int index;
//		try {
//			index = FindMiddleIndex.findMiddleIndex(numbers);
//			System.out.println(index);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}



			int n = 12321;
			try {
				isPal(n);
				System.out.println("Yes");
			} catch (Exception e) {
				System.out.println("No");
			}
			n = 1231;
			try {
				isPal(n);
				System.out.println("Yes");
			} catch (Exception e) {
				System.out.println("No");
			}

			n = 12;
			try {
				isPal(n);
				System.out.println("Yes");
			} catch (Exception e) {
				System.out.println("No");
			}

			n = 88;
			try {
				isPal(n);
				System.out.println("Yes");
			} catch (Exception e) {
				System.out.println("No");
			}

			n = 8999;
			try {
				isPal(n);
				System.out.println("Yes");
			} catch (Exception e) {
				System.out.println("No");
			}


	}



		// A function that reurns true
		// only if num contains one digit
		public static int oneDigit(int num) {

			if ((num >= 0) && (num < 10))
				return 1;
			else
				return 0;
		}

		public static int isPalUtil
				(int num, int dupNum) throws Exception {

			// base condition to return once we
			// move past first digit
			if (num == 0) {
				return dupNum;
			} else {
				dupNum = isPalUtil(num / 10, dupNum);
			}

			// Check for equality of first digit of
			// num and dupNum
			if (num % 10 == dupNum % 10) {
				// if first digit values of num and
				// dupNum are equal divide dupNum
				// value by 10 to keep moving in sync
				// with num.
				return dupNum / 10;
			} else {
				// At position values are not
				// matching throw exception and exit.
				// no need to proceed further.
				throw new Exception();
			}

		}

		public static int isPal(int num)
				throws Exception {

			if (num < 0)
				num = (-num);

			int dupNum = (num);

			return isPalUtil(num, dupNum);
		}

	}

