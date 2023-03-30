package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateNames {

	public static void main(String args[]) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Anand");
		names.add("Nihith");
		names.add("Nihira");
		names.add("Manju");
		names.add("Chitti");
		names.add("Nihith");
		names.add("Nihira");
		names.add("Neelu");
		names.add("Chitti");
		
		/*
		 * Set<String> uniqueNames = new HashSet<>();
		 * 
		 * Set<String> duplicateNames =
		 * names.stream().filter(name->!uniqueNames.add(name)).collect(Collectors.toSet(
		 * )); System.out.println(duplicateNames);
		 * 
		 * //duplicateNames.stream().forEach(name->System.out.println(name));
		 * 
		 * Map<String, Long> namesAgre =
		 * names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.
		 * counting()));
		 * 
		 * System.out.println(namesAgre);
		 * 
		 * Set<String> duplicates =
		 * namesAgre.entrySet().stream().filter(entry->entry.getValue()>1).map(entry->
		 * entry.getKey()).collect(Collectors.toSet()); System.out.println(duplicates);
		 * 
		 * Set<String> dNames = names.stream().filter(name->Collections.frequency(names,
		 * name)>1).collect(Collectors.toSet());
		 * 
		 * System.out.println(dNames);
		 */
		Set<String> duplicateNames = new HashSet<>();
		Set<String> result1 = names.stream().filter(name->!duplicateNames.add(name)).collect(Collectors.toSet());
		
		System.out.println("Result1:"+result1);
		
		Map<String,Long> nameGroups = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<String> result2 = nameGroups.entrySet().stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toSet());
		
		System.out.println("Result2:"+result2);
		
		Set<String> result3 = names.stream().filter(name->Collections.frequency(names, name)>1).collect(Collectors.toSet());
		
		System.out.println("Result3:"+result3);
		
		Map<String,Long> namesMap= names.stream().collect( Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Set<String> nameSet = namesMap.entrySet().stream().filter(entry -> entry.getValue()>1).map(entry -> entry.getKey()).collect(Collectors.toSet());
		
		System.out.println("Name Set:"+nameSet);
		
	}
	
}
