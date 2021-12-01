package com.xworkz.zoo;

public class Zoo {
	String zooName;
	String state;
	String location;
	String route;
	int ticketPricePerPerson;
	int noOfAnimals;

	public Zoo(String ZooName, String State, String Location, String Route, int TicketPricePerPerson, int NoOfAnimals) {
		this.zooName = ZooName;
		this.state = State;
		this.location = Location;
		this.route = Route;
		this.ticketPricePerPerson = TicketPricePerPerson;
		this.noOfAnimals = NoOfAnimals;
	}

	public static void main(String args[]) {
		Zoo zoo = new Zoo("Bannerghatta naional park", "Kanataka", "Banglore", "South Banglore City", 300, 2300);
		System.out.println("upper case " + zoo.zooName.toUpperCase());
		System.out.println("upper case " + zoo.state.toUpperCase());
		System.out.println("lower case " + zoo.location.toLowerCase());
		System.out.println("lower case " + zoo.route.toLowerCase());
		System.out.println("hashcode" + zoo.location.hashCode());
		System.out.println("length " + zoo.route.length());

	}

}
