package com.core.strings;

public class SwapChars {
	public static void main(String args[]) {
		
		String s = "Anand";
		
		System.out.println(s);
		System.out.println(swap(s,0,4));
		
		System.out.println(s);
	}
	
	public static char[] swap(String s,int i, int j) {
		
		char[] charArr = s.toCharArray();
		
		char temp = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;
		
		return charArr;
	}

}
