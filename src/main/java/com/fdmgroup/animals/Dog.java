package com.fdmgroup.animals;
public class Dog extends Animal {

	public Dog(String b, double w) {
		super(b, w);
	}

	// Customized speak method of Animal
	public void speak() {
		System.out.println("Bow wow");
	}

}
