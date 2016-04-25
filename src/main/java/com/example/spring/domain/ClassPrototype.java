package com.example.spring.domain;

public class ClassPrototype {

	private static int index;
	
	public ClassPrototype(){
		index++;
		System.out.println("Numar instante: " + index);
	}
}
