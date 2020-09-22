package com.shiven.dynamic.programming;

public class FibonacciSeries {
    
    public static int fibo(int n, int[] fiboArray) {
        if(n==1) {
            fiboArray[0]=1;
            return 1;
        }
        if(n==2) {
            fiboArray[1]=1;
            return 1;
        }
        int temp=0;
        if(fiboArray[n-1]==0) {
            temp = fibo(n-1,fiboArray) + fibo(n-2,fiboArray);
            fiboArray[n-1] = temp;
        } else {
            temp = fiboArray[n-1];
        }
        return temp;
    }
    
    public static void main(String[] args) {
        int n = 7;
        int[] fiboArray = new int[n+2];
        System.out.println(FibonacciSeries.fibo(n,fiboArray));
    }

}
