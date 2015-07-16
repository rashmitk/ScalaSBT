package com.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.java.Person;

public class PersonTest {

	@Test
	public void testPersonName() {
		Person p1 = new Person("John");
		assertEquals("John", p1.getName());
	}
	
	@Test
	public void testPersonNameCompany() {
		Person p2 = new Person("Jenny","IBM");
		assertEquals("Jenny", p2.getName());
	}
}
