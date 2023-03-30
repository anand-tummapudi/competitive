package com.core.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagrams {

	public static void main(String[] args) {
		String s1="danger";
		String s2="garden";
		
		/*
		 * List<Character> charList1 =
		 * s1.chars().mapToObj(i->(char)i).collect(Collectors.toList()); List<Character>
		 * charList2 = s2.chars().mapToObj(i->(char)i).collect(Collectors.toList());
		 * 
		 * Map<Character,Long> h1 =
		 * charList1.stream().collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting())); Map<Character,Long> h2 =
		 * charList2.stream().collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting()));
		 * 
		 * System.out.println(h1); System.out.println(h2); List<Boolean> unMa =
		 * h1.entrySet().stream().map(e->e.getValue()==h2.get(e.getKey())).collect(
		 * Collectors.toList());
		 * 
		 * System.out.println(unMa);
		 * 
		 * for (Boolean boolean1 : unMa) { if(!boolean1) {
		 * System.out.println("Not an Anagram"); return; } }
		 */
		
		char []c1 = s1.toCharArray();
		char []c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		Boolean compare = Arrays.equals(c1, c2);
		if(compare) {
			System.out.println("Anangram");
		}else {
			System.out.println("Not an Anagram");
		}
	}
}
