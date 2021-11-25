package com.xworkz.shoe;

public class Shoe {
	String brand;
	String Type;
	String colour;
	int price;

	void Nike() {
		this.brand = "nike";
		this.Type = "Running Shoe";
		this.colour = "White";
		int price = 1800;
		System.out.println();
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + Type);
		System.out.println("Colour: " + colour);
		System.out.println("Price: " + price);
		this.Fila();
	}

	void Fila() {
		this.brand = "fila";
		this.Type = "Casual shoe";
		this.colour = "Blue";
		int price = 3300;
		System.out.println();
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + Type);
		System.out.println("Colour: " + colour);
		System.out.println("Price: " + price);
		this.Puma();
		
	}

	void Puma() {
		this.brand = "puma";
		this.Type = "Running Shoe";
		this.colour = "Dark denim";
		int price = 3900;
		System.out.println();
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + Type);
		System.out.println("Colour: " + colour);
		System.out.println("Price: " + price);
		this.Sketcher();
	}

	void Sketcher() {
		this.brand = "sketcher";
		this.Type= "lace-up";
		this.colour  = "Green";
		int price = 6000;
		System.out.println();
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + Type);
		System.out.println("Colour: " + colour);
		System.out.println("Price: " + price);
		this.Rebook();
		
	}

	void Rebook() {
		this.brand = "rebook";
		String Type = "Running Shoe";
		this.colour = "Blue";
		int price = 1500;
		System.out.println();
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + Type);
		System.out.println("Colour: " + colour);
		System.out.println("Price: " + price);
		
	}
}
