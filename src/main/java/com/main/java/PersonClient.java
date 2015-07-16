package com.main.java;

public class PersonClient {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Jason");
		Person p3 = new Person("Jason","IBM");
		Person p4 = new Person("Martin","IBM","NY");
		Person p5 = new Person("Sarah","CYBAGE","PUNE","30");
		
		System.out.println(p1);
		System.out.println(p2.getName());
		System.out.println(p3.getName()+" "+p3.getCompany());
		System.out.println(p4.getName()+" "+p4.getCompany()+" "+p4.getCity());
		System.out.println(p5.getName()+" "+p5.getCompany()+" "+p5.getCity()+" "+p5.getAge());
		
	}
}
