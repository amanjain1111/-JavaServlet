package com.atcs.demo.model;

public class Employee {
	String name;
	int id;
	int Salary;
	int age;
	public Employee() {
		
	}
	public Employee(String name, int id, int salary, int age) {
		super();
		this.name = name;
		this.id = id;
		Salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
	