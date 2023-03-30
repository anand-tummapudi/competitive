package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9);
		System.out.println(numbers);
		List<Integer> squares = numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(squares);
		
		List<String> strings = Arrays.asList("","");
		
		List<Integer> evenNumbers = numbers.stream().filter(i->i%2==0).peek(e->System.out.println("Value:"+e)).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		int ff = numbers.stream().peek(n->System.out.println("Before:"+n)).filter(i->i>5).findFirst().get();
		
		System.out.println("First Odd Number:"+ff);

	}

}
