package com.shiven.dynamic.programming;

public class CheckPalindrome {
    
    public static boolean isPalindrome(String input) {
        boolean result=true;
        for(int i=0;i<=input.length()/2;i++) {
            if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
                result = false;
                break;
            }
        }
        return result;
    }
    
    public static boolean reccursionPalindromeCheck(String input) {
        
        if(input.length()==0 || input.length()==1) {
            return true;
        }
        
        if(input.charAt(0)!=input.charAt(input.length()-1)) {
            return false;
        }
        return reccursionPalindromeCheck(input.substring(1, input.length()-1));
    }
    
    public static void main(String[] args) {
        System.out.println(CheckPalindrome.isPalindrome("ABCCBA"));
        System.out.println(CheckPalindrome.reccursionPalindromeCheck("A"));
    }

}
