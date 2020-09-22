package com.shiven.interview.questions.collections;

public class ArrayInterview {
	
	public boolean numSum(int[] num) {
		boolean isEqual = false;
		for(int i=0;i<num.length;i++) {
			int sumLeftSplit = 0;
			for(int j=0;j<=i;j++) {
				sumLeftSplit += num[j];
			}
			int sumRightSplit = 0;
			for(int k=i+1;k<num.length;k++) {
				sumRightSplit += num[k];
			}
			
			if(sumLeftSplit==sumRightSplit) {
				isEqual = true;
				break;
			}
		}
		return isEqual;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,5};
		System.out.println(new ArrayInterview().numSum(arr));
	}

}
