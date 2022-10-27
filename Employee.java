package org.codeforfuture.Assertion;

public class Employee {
	public int no;
	public String name;
	public int year;
	public int baseSalary;
	public Employee(int no, String name, int year) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
	}
	
	
	public int getYear() {
		return year;
	}


	public double calculateSalary() {
	
		
		return baseSalary * year;
		
	}


	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	
}

