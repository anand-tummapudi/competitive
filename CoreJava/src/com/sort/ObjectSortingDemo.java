package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Apple{
	String name;
	Integer weight;
	String color;
	
	public Apple() {
		super();
	}

	public Apple(String name, Integer weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}


	@Override
	public String toString() {
		return "Apple [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

public class ObjectSortingDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Apple> inventory = new ArrayList<>();
		inventory.add(new Apple("Kashmir", 200, "Red"));
		inventory.add(new Apple("Simla", 400, "Green"));
		inventory.add(new Apple("Royal", 250, "Brown"));
		inventory.add(new Apple("Alahabad", 430, "Yellow"));
		inventory.add(new Apple("Mumbai", 120, "Purple"));
		
		System.out.println(inventory);
		
		/*
		 * Collections.sort(inventory,new Comparator<Apple>() { public int compare(Apple
		 * a1,Apple a2) { return a1.getWeight().compareTo(a2.getWeight()); } });
		 */
		
		inventory.sort(Comparator.comparing(Apple::getName));
		
		System.out.println(inventory);

	}

}
