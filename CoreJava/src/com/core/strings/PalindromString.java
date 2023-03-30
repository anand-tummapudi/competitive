package com.core.strings;

public class PalindromString {
	
	public static void main(String args[]) {
		
		String s = "ab123sds321ba";
		String s1 = "",s2="", revStr = "";
		
		if(s.length()%2==0) {
			s1 = s.substring(0,s.length()/2);
			s2 = s.substring(s.length()/2,s.length());
			StringBuilder sb=new StringBuilder(s2);
			s2 = sb.reverse().toString();
		}else {
			s1 = s.substring(0,(s.length()/2)+1);
			s2 = s.substring(s.length()/2,s.length());
			StringBuilder sb=new StringBuilder(s2);
			s2 = sb.reverse().toString();
		}
		
		System.out.println("SubSctring:"+s1+"---S2:"+s2);
		
		if(s1.equals(s2)) {
			System.out.println("Pallindrom");
		}
		
		StringBuilder sb = new StringBuilder(s);
		
		if(s.equals(sb.reverse().toString())) {
			System.out.println("#######PALLINDROM######");
		}
		
		for(int i=s.length()-1;i>=0;i--) {
			revStr = revStr+s.charAt(i);
		}
		
		System.out.println("Reverse String:"+revStr);
	}

}
