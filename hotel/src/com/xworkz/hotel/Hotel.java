package com.xworkz.hotel;

public class Hotel {
	String name;
	String type;
	String cusine;

	void hotel1() {
		name = "The Hut";
		type = "veg";
		cusine = "Indian";
		System.out.println();
		System.out.println("Name of the hotel is:" + name);
		System.out.println("Type of food :" + type);
		System.out.println("Cusine: " + cusine);
		hotel2();

	}

	void hotel2() {
		name = "Food Inn";
		type = "veg";
		cusine = "North Indian";
		System.out.println();
		System.out.println("Name of the hotel is:" + name);
		System.out.println("Type of food :" + type);
		System.out.println("Cusine: " + cusine);
		hotel3();
	}

	void hotel3() {
		name = "The Meridian";
		type = "non-veg";
		cusine = "Indian";
		System.out.println();
		System.out.println("Name of the hotel is:" + name);
		System.out.println("Type of food :" + type);
		System.out.println("Cusine: " + cusine);

	}

}
