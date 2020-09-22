package com.shiven.java.practice;

public class ReverseStringRecurrsion {
	
	public String reverseString(String str){
	
		char[] chars = str.toCharArray();
		for(int i=0;i<chars.length/2;i++) {
			char temp = chars[i];
			chars[i]=chars[chars.length-1-i];
			chars[chars.length-1-i] = temp;
		}
		return new String(chars);
	}
	
	
	int i=0;
	public String reccursionReverse(String string) {
		char[] chars = string.toCharArray();
		while(i<chars.length/2) {
			char temp = chars[i];
			chars[i]=chars[chars.length-1-i];
			chars[chars.length-1-i] = temp;
			i++;
			reccursionReverse(new String(chars));
		}
		return new String(chars);
	}
	
	public static void main(String[] args) {
		System.out.println(new ReverseStringRecurrsion().reverseString("my name is lakhan"));
		//System.out.println(new ReverseStringRecurrsion().reccursionReverse("shivendra"));
	}

}
