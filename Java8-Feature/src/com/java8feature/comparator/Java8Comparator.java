package com.java8feature.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Java8Comparator {
	public static void main(String[] args) {
		Comparator<Employee> as = (employee1, employee2) -> employee2.id - employee1.id;
		Employee data = new Employee(101, "Bhanu");
		Employee data1 = new Employee(102, "Uday");

		List<Employee> list = new ArrayList<Employee>();
		list.add(data);
		list.add(data1);
		list.sort(as);
		System.out.println(list);

		
		
		
	}
}

class Employee {
	int id;
	String name;

	public Employee() {

	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "\t" + name;
	}
}
