package com.xworkz.email;

public class EmailRunner {

	public static void main(String[] args) {
		Email obj = new Email("abc@gmail.com", "def@gmail.com", "hello");
		
		
		System.out.println(obj.toEmailId);
		System.out.println(obj.fromEmailId);
		System.out.println(obj.subject);
		
		
		obj.email("ABC@gmail.com", "DEF@gmail.com", "Hii");
		
	
	}

}
