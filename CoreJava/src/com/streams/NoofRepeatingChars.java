package com.streams;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoofRepeatingChars {

	public static void main(String[] args) {

		String s = "aaa22222333333333333338888888888888nnnnnnnnnnnnnnn2222222222hdhdhdhdh";
		
		/*
		 * char[] chars = s.toCharArray(); List<Character> charList = new
		 * String(chars).chars().mapToObj(i->(char)i).collect(Collectors.toList());
		 * Map<Character,Long> charGroup =
		 * charList.stream().collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting())); System.out.println(charGroup); Long max =
		 * Collections.max(charGroup.values());
		 * 
		 * System.out.println("Maximum Count:"+max);
		 * 
		 * Set<Character> resultCharSet =
		 * charGroup.entrySet().stream().filter(entry->entry.getValue()==max).map(entry-
		 * >entry.getKey()).collect(Collectors.toSet());
		 * 
		 * System.out.println(resultCharSet);
		 */
		
		List<Character> charList = s.chars().mapToObj(i->(char)i).collect(Collectors.toList());
		
		Map<Character,Long> charMap = charList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Long max = Collections.max(charMap.values());
		Set<Character> charSet = charMap.entrySet().stream().filter(entry->entry.getValue()==Collections.max(charMap.values())).map(entry->entry.getKey()).collect(Collectors.toSet());
		System.out.println(charSet);
		charSet.stream().forEach(val -> System.out.println(val+"-->"+max));
		
		
	}

}
