package com.xworkz.flipkart;

public class Flipkart {
	String grocery;
	String clothing;
	String mobilephone;
	String electronics;

	public Flipkart(String grocery, String clothing, String mobilePhone, String electronics) {
		this.grocery = grocery;
		this.clothing = clothing;
		this.mobilephone = mobilePhone;
		this.electronics = electronics;
	}

	public static void main(String args[]) {
		Flipkart flipkart = new Flipkart("rice, dal, pulse, cooking oil", "men, women, kids", "smartPhones","electrical items");
		System.out.println(flipkart.grocery.toUpperCase());
		System.out.println(flipkart.clothing.toLowerCase());
		System.out.println(flipkart.mobilephone.length());
		System.out.println(flipkart.electronics.hashCode());

	}

}
