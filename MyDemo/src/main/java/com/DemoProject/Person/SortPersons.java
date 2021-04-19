package com.DemoProject.Person;

import java.util.ArrayList;
import java.util.List;

public class SortPersons {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person(11, "Umesh", "Awasthi"));
		persons.add(new Person(45, "Lokes", "Sharma"));
		persons.add(new Person(1, "Sahil", "Mehta"));
		persons.add(new Person(81, "Ramesh","Chopra"));
		persons.add(new Person(90, "Paul", "Dhiman"));
		persons.add(new Person(22, "Roy", "Chawla"));
		System.out.println("Before sorting");
		persons.forEach((s) -> System.out.println(s));

		persons.sort((Person s1, Person s2) -> s1.getFirstName().compareTo(s2.getFirstName()));
		System.out.println("After sorting");
		persons.forEach((s) -> System.out.println(s));
	}
}
