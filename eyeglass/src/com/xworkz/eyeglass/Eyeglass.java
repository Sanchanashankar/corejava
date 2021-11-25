package com.xworkz.eyeglass;

public class Eyeglass {
	String type;
	String colour;
	String frameType;
	String frameShape;
	
	void nike() {
		this.type="Eye Glass";
		this.colour="Grey";
		this.frameType="Full Rim";
		this.frameShape="Round";
		int price=800;
		System.out.println("Type: " +type);
		System.out.println("Colour: "+colour);
		System.out.println("Frame Type: "+frameType);
		System.out.println("Frame Shape: "+frameShape);
		System.out.println("Price: "+price);
		this.gucci();
	}
	
	void gucci() {
		this.type="Sun glasses";
		this.colour="Transparent";
		this.frameType="Metal";
		this.frameShape="Cat eye";
		int price=1200;
		System.out.println();
		System.out.println("Type: " +type);
		System.out.println("Colour: "+colour);
		System.out.println("Frame Type: "+frameType);
		System.out.println("Frame Shape: "+frameShape);
		System.out.println("Price: "+price);
		this.coach();
	}
	
	void coach() {
		this.type="vision";
		this.colour="brown";
		this.frameType="fiber";
		this.frameShape="Rectangle";
		int price=1300;
		System.out.println();
		System.out.println("Type: " +type);
		System.out.println("Colour: "+colour);
		System.out.println("Frame Type: "+frameType);
		System.out.println("Frame Shape: "+frameShape);
		System.out.println("Price: "+price);
		
	}
}
