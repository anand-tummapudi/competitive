package com.programming;

public class NumericPalindrom {
	static int rev = 0;
	
	public static void main(String args[]) {
		
		/*
		 * int n1 = 1001; int temp = n1; int reverse = 0;
		 * 
		 * System.out.println("Reverse a Number");
		 * 
		 * while(temp!=0) { int reminder = temp%10; reverse = reverse*10+reminder; temp
		 * = temp/10; }
		 * 
		 * System.out.println(n1+"<---->"+reverse);
		 * 
		 * if(n1==reverse) { System.out.println("Palindrom"); }else {
		 * System.out.println("Not a palindrom"); }
		 */
		
		int n = 1001;
		
		reverseRecur(n);
		
		System.out.println("Rev:"+rev);
		
		if(n==rev) {
			System.out.println("Palindrome");
		}
	}

	 static void reverseRecur(int n) {
		// TODO Auto-generated method stub
		if(n<=0)
			return;
		int rem = n%10;
		rev = (rev*10)+rem;
		reverseRecur(n/10);
	}
}
