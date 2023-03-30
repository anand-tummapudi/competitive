package com.core.strings;

import java.util.HashSet;
import java.util.Set;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcd";

		Set<String> permutations = getPermutations(s);

		System.out.println(permutations);

	}

	/*
	 * public static Set<String> getPermutations(String str){
	 * 
	 * Set<String> permutations = new HashSet<String>();
	 * 
	 * if(str==null) return null; else if(str.length()==0) { permutations.add("");
	 * return permutations; }
	 * 
	 * 
	 * char first = str.charAt(0);
	 * 
	 * String sub = str.substring(1);
	 * 
	 * Set<String> words = getPermutations(sub);
	 * 
	 * for(String strNew:words) {
	 * 
	 * for(int i=0;i<=strNew.length();i++) { permutations.add(strNew.substring(0,
	 * i)+first+strNew.substring(i)); } }
	 * 
	 * 
	 * char first = str.charAt(0); String sub = str.substring(1);
	 * 
	 * Set<String> words = getPermutations(sub);
	 * 
	 * for(String strNew:words) { for(int i=0;i<=strNew.length();i++) {
	 * permutations.add(strNew.substring(0,i)+first+strNew.substring(i)); } }
	 * 
	 * return permutations; }
	 */
	
	public static Set<String> getPermutations(String str){
		Set<String> permutations = new HashSet<String>();
		
		if(str==null) {
			return null;
		}else if(str.length()==0) {
			permutations.add("");
			return permutations;
		}
		
		char first = str.charAt(0);
		
		String subStr = str.substring(1);
		
		Set<String> words = getPermutations(subStr);
		
		for(String newStr:words) {
			for(int i=0;i<=newStr.length();i++) {
				permutations.add(newStr.substring(0,i)+first+newStr.substring(i));
			}
		}
		
		return permutations;
	}
}
