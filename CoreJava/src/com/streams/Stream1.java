package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream1 {

	public static void main(String[] args) {
		
		/*
		 * ArrayList<Integer> al = new ArrayList<>(); al.add(10); al.add(11);
		 * al.add(12); al.add(13); al.add(14); al.add(15); al.add(16); al.add(17);
		 * al.add(18); al.add(19); al.add(20);
		 * 
		 * List<Integer> filteredList =
		 * al.stream().filter(i->i%2==0).collect(Collectors.toList());
		 * 
		 * filteredList.stream().forEach(i->System.out.println(i));
		 * 
		 * System.out.println(filteredList);
		 */
		
		//IntStream.range(1, 10).forEach(System.out::println);
		//IntStream.range(1, 20).skip(5).forEach(x->System.out.println(x-5));
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		int maxNum = al.stream().max(Integer::compare).get();
		System.out.println("Maximum Number in the Series:"+maxNum);
		
		int sumOfSeries = al.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum Of Series:"+sumOfSeries);
		
		int missingNumber = (maxNum*(maxNum+1))/2 - sumOfSeries;
		
		System.out.println("Missing Number:"+missingNumber);
		
		
		
		
		
	}

}
