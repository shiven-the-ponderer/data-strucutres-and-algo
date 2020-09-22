package com.shiven.learning.basiccoding;

public class InterviewQuestions {
    
    public void fibonacci(int count) {
        
        int[] fibbo = new int[count];
        
        fibbo[0] = 0;
        fibbo[1] = 1;
        for(int i=2;i<count;i++) {
            fibbo[i] = fibbo[i-1]+fibbo[i-2];
        }
        for(int i:fibbo) {
            System.out.println(i);
        }
        //Arrays.asList(fibbo).stream().forEach(number->System.out.println(number));
    }
    
    public void primeNumber(int number) {
        
    }
    
    public void palindrome(String str) {
        boolean isPalindrome =false;
        for(int i=0;i<str.length();i++) {
            if(str.length()%2==0) {
                if(str.indexOf(i)==str.indexOf(str.length()-1)) {
                    isPalindrome=true;
                }else {
                    isPalindrome=false;
                }
            }else {
                
            }
        }
        
    }
    
    public static void main(String[] args) {
        InterviewQuestions interviewQuestions = new InterviewQuestions();
        interviewQuestions.fibonacci(5);
    }

}
