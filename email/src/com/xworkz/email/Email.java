package com.xworkz.email;

public class Email {
	String toEmailId;
	String fromEmailId;
	String subject;

	public Email(String toEmailId, String fromEmailId, String subject) {
		System.out.println("invoking construuctor");
		this.toEmailId = toEmailId;
		this.fromEmailId = fromEmailId;
		this.subject = subject;
		System.out.println(toEmailId);
		System.out.println(fromEmailId);
		System.out.println(subject);
		System.out.println();
	}

	public void email(String toEmailId, String fromEmailId, String subject) {
		System.out.println();
		System.out.println("invoking method");
		System.out.println(toEmailId);
		System.out.println(fromEmailId);
		System.out.println(subject);
		System.out.println();
		System.out.println(this.toEmailId);
		System.out.println(this.fromEmailId);
		System.out.println(this.subject);
	}
}
