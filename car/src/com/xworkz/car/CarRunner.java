package com.xworkz.car;

public class CarRunner {

	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.brand);
		System.out.println(obj.name);
		System.out.println(obj.price);
		obj.methodA();
		obj.methodB();
	}

}
