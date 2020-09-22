package com.shiven.algorithms.sorts;

public class SelectionSort {
	
	public static void sort(int[] unsortedArray){
		int l = unsortedArray.length;
		
		for(int i = 0; i<l-1;i++)
		{
			//it will set i = 0 at first
			int minIndex = i;
			{
				for(int j=i+1;j<l;j++){
					if(unsortedArray[j]<unsortedArray[minIndex]){
						minIndex = j;
					}
				}
				
				int temp = unsortedArray[minIndex];
				unsortedArray[minIndex] = unsortedArray[i];
				unsortedArray[i] = temp;
			}
		}
		
		for(int i : unsortedArray){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int[] arr ={9,1,12,7,4,12};
		SelectionSort.sort(arr);
		
	}

}
