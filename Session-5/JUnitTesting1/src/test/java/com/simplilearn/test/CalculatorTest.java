package com.simplilearn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calc;
	@BeforeEach
	public void setUp() {
		System.out.println("Resource created");
		calc= new Calculator();
	}
	@AfterEach
	public void tearDown() {
		calc=null;
		System.out.println("Resource closed");
	}
	@Test
	@DisplayName("Addition")
	public void testAdd() {
		System.out.println("Add test executed");
		assertEquals(7, calc.add(3, 4));
	}
	@Test
	@DisplayName("Subtraction")
	public void testSub() {
		System.out.println("Sub test executed");
		assertEquals(-9, calc.sub(9, 18));
	}
}
