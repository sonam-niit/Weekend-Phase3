package com.simplilearn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionDemo {

	public String getName() {
		return "Sonam";
	}
	public boolean checkAge(int age) {
		return age>=18;
	}
	@Test
	public void testAssert1() {
		
		String expected="Sonam";
		assertEquals(expected, getName());
	}
	@Test
	public void testAssert2() {
		assertTrue(checkAge(30));
		assertFalse(checkAge(5));
	}
	@Test
	public void testAssert3() {
		String name=null;
		assertNull(name);
		
		name= "Simplilearn";
		assertNotNull(name);
	}
	@Test 
	public void testAssert4() {
		assertThrows(ArithmeticException.class, ()->{ int a= 10/0;});
	}
	//passing executable as a parameter is applicable in JDK called as lambda function

}
