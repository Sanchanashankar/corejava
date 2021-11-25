package com.xworkz.car;

public class Car {
	String brand="Renault";
	int price=800000;
	String name="Triber";

	public void methodA() {
		System.out.println("invoking first method");
		System.out.println(brand);
	}

	void methodB() {
		System.out.println("invoking sencond method");
		System.out.println(price);
	}

	private void methodC() {
		System.out.println("invoking third method");
		System.out.println(name);
	}
}
