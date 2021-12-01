package com.xworkz.travel;

public class TravelAgency {
	String nameOfTravelAgency;
	String Location;
	int pincode;
	String service;
	long contactNumber;
	
public TravelAgency(String nameOfTravelAgency, String Location, int pincode, String service, long contactNumber) {
	this.nameOfTravelAgency=nameOfTravelAgency;
	this.Location=Location;
	this.pincode=pincode;
	this.service=service;
	this.contactNumber=contactNumber;
	
}
public static void main(String  args[]) {
	TravelAgency agency = new TravelAgency("Trinity", "Banglore", 560038, "international service, car hire, group travel, day trips, flights", 8884407681l);
	System.out.println("upper case " +agency.nameOfTravelAgency.toUpperCase());
	System.out.println("lower case " +agency.Location.toLowerCase());
	System.out.println("length " +agency.service.length());
	System.out.println("index value "+agency.contactNumber);
}
}
