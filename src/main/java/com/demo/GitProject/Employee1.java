package com.demo.GitProject;

public class Employee1 {
	
	int id;
	String name;
	private static double salary;
	public Employee1(int id, String nm,double sal) {
		this.id=id;
		this.name=nm;
		Employee1.setSalary(sal);
	}
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		Employee1.salary = salary;
	}
	public static double calSalary(double salary) {
		double salary1=(salary*10)/100;
		return salary1;	
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(101,"Shariff",20000.00);
		System.out.println(e1.id+" "+e1.name+" Current Salary: "+Employee1.getSalary());
		System.out.println("Incremented Salary: "+(calSalary(getSalary())+getSalary()));
	}
	
}