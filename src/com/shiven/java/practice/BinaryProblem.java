package com.shiven.java.practice;

import java.util.Arrays;

public class BinaryProblem {

    public Long getBinary(Long number) {

        String[] input = String.valueOf(number).split("");
        int[] finalOutput = new int[100];
        for(int i=0;i<input.length;i++) {
            int binaryInput = Integer.parseInt(input[i]);
            int remainder = 0;
            int divisor = 0;
            int[] binaryValues = new int[100];
            int num = Integer.parseInt(input[i]);
            while(num!=1) {
                num = num/2;
                remainder = num%2;
                binaryValues[i] = remainder;
            }
            System.out.println(Arrays.toString(binaryValues));
            for(int j=0;j<binaryValues.length/2+1;j++) {
                binaryValues[j] = binaryValues[binaryValues.length-j];
            }
            for(int k=0;k<binaryValues.length;k++) {
                finalOutput[k] = binaryValues[k];
            }
        }
        String output="";
        for(int i=0;i<finalOutput.length;i++) {
            output.concat(String.valueOf(finalOutput[i]));
        }
        return Long.parseLong(output);
    }

    public static void main(String[] args) {
        System.out.println(new BinaryProblem().getBinary(123L));
    }
}
