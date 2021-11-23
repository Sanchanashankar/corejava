package com.xworkz.employee;

public class Employee {
	String company;
	int noOfEmployees;
	double salaryPerEmployee;
	String employeeName;

	public Employee(String company, int noOfEmployees, double salaryPerEmployee, String employeeName) {
		System.out.println("invoking 1");
		this.company = company;
		this.noOfEmployees = noOfEmployees;
		this.salaryPerEmployee = salaryPerEmployee;
		this.employeeName = employeeName;

		System.out.println(company);
		System.out.println(noOfEmployees);
		System.out.println(salaryPerEmployee);
		System.out.println(employeeName);

	}

	public void employee(String company, int noOfEmployees, double salaryPerEmployee, String employeeName) {
		System.out.println("invoking 2");
		System.out.println(this.company);
		System.out.println(this.noOfEmployees);
		System.out.println(this.salaryPerEmployee);
		System.out.println(this.employeeName);
	}

}
