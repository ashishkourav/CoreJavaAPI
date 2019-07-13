package com.java8feature.functional;

import java.util.ArrayList;
import java.util.List;

public class FunctionalFeature {
	public static void main(String[] args) {
		Student student = new Student(101, "Uday");
		Student student1 = new Student(107, "Kumar");
		Student student2 = new Student(108, "Shanu");
		Student student3 = new Student(103, "Bhanu");
		List<Student> list = new ArrayList<Student>();
		boolean anyMatch = list.stream().anyMatch(p -> p.id == 101);
		System.out.println(anyMatch);

	}
}

class Student {
	int id;
	String name;

	public Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "\t" + name;
	}

}