package com.xworkz.electronicitems;

public class ElectronicsItems {

	String brand;
	double price;
	String colour;
	
	void tv() {
		this.brand="LG";
		this.price=40000.000;
		this.colour="black";
		int inches=43;
		
		System.out.println();
		System.out.println("TV Brand name: "+brand);
		System.out.println("TV price: " +price);
		System.out.println("TV Colour: " +colour);
		System.out.println("TV Inches: "+inches);
		this.microwave();
		
	}
	void washingmachine() {
		this.brand="BOSH";
		this.price=45000.000;
		this.colour="Grey";
		int capacity=48;
		
		System.out.println();
		System.out.println("washingmachine Brand name: "+brand);
		System.out.println("washingmachine price: " +price);
		System.out.println("washingmachine Colour: " +colour);
		System.out.println("washingmachine Capacity in kg: "+capacity);
	 this.microwaves();
		
	}
	void coffeemaker() {
		this.brand="Pegion";
		this.price=10000.000;
		this.colour="silver";
		int capacity=2;
		System.out.println();
		System.out.println("coffeemaker Brand name: "+brand);
		System.out.println("coffeemaker price: " +price);
		System.out.println("coffeemaker Colour: " +colour);
		System.out.println("coffeemaker Capacity liters: "+capacity);
		this.tv();
	}
	
	void microwave() {
		this.brand="Samsung";
		this.price=15000.000;
		this.colour="white";
		int capacity=10;
		System.out.println();
		System.out.println("microwave Brand name: "+brand);
		System.out.println("microwave price: " +price);
		System.out.println("microwave Colour: " +colour);
		System.out.println("microwave Capacity liters: "+capacity);
		this.coffeemaker();
	}
	
	void microwaves() {
		this.brand="LFB";
		this.price=25000.000;
		this.colour="grey";
		int capacity=10;
		System.out.println();
		System.out.println("microwaves Brand name: "+brand);
		System.out.println("microwaves price: " +price);
		System.out.println("microwaves Colour: " +colour);
		System.out.println("microwaves Capacity liters: "+capacity);
	}


}
