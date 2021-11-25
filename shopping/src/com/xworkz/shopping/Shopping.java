package com.xworkz.shopping;

public class Shopping {
	String items;
	
	void grocessories() {
		this.items="rice, dal, masala, cooking oil";
		System.out.println("Grocessories: " +items);
		this.fruits_and_vegetables();
		
	}
	
	void fruits_and_vegetables() {
		this.items="fresh fruits and vegetables";
		System.out.println("Fruits and vegetables: "+items);
		this.dairy();
	}
	
	void  dairy() {
		this.items="dairy products";
		System.out.println("Dairy: "+items);
		this.Applicances();
	}
	void packedFood() {
		this.items="chocolates, pasta & noodels, breakfast cereals, cookies";
	}
	void Applicances() {
		this.items="kitchen and home";
		System.out.println("Applicances: "+items);
	}
}
