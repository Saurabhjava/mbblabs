package com;

public class Animal {
	public void eat() {
		System.out.println("Animal Eat");
	}
}

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog Eat");
	}
}
