package com.main.java;

public class Person {

	String name;
	String company;
	String city;
	String age;

	public Person() {
		System.out.println("Person object initiated");
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String company) {
		this.name = name;
		this.company = company;
	}

	public Person(String name, String company, String city) {
		this.name = name;
		this.company = company;
		this.city = city;

	}

	public Person(String name, String company, String city, String age) {
		this.name = name;
		this.company = company;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
