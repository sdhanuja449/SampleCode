package com.coreExamples.sort;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		
			return emp.id-this.id; // just remember this logic: this.id-emp.id ascending order 
			                       //emp.id-this.id descending order. source mkyong
	}	
		
	}




