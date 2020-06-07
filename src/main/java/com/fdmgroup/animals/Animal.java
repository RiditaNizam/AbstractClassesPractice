package com.fdmgroup.animals;
public abstract class Animal {

	private String breed;
	private double weight;

	public Animal(String b, double w) {
		breed = b;
		weight = w;
	}

	// Abstract because dogs and cats speak in different ways
	public abstract void speak();

	public void eat() {
	}

}
