package org.codeforfuture.Assertion;

import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
	
	// 	min maas en az 750 olmali
		
		int baseSalary = Integer.parseInt(ScannerUtil.read("please enter the base salary"));
		
		assert baseSalary >= 750 : "base salary must be more than 750";
		
		Employee e = new Employee(1,"ahmet",10);
		e.setBaseSalary(baseSalary);
		
		
		System.out.println("salary : " + e.calculateSalary());
		System.out.println("year   : " + e.getYear());
		
		
		
		
	}
}
