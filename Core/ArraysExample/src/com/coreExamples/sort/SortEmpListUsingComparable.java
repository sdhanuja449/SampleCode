package com.coreExamples.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmpListUsingComparable {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Dhanuja");
		Employee e2 = new Employee(0, "Hyma");
		Employee e3 = new Employee(2, "Bhanu");
		Employee e4 = new Employee(2, "Fehmi");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		System.out.println("list before sort:");
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println("sorted list:  ");
		System.out.println(empList);
	}

}
