package com.simplilearn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test cases for Database Connectivity")
class MyFirstTest {

	@BeforeAll
	public static void setUpBeforeAll() {
		//open thread safe objects like session factory
		System.out.println("Before All Test cases");
	}
	@AfterAll
	public static void tearDownAfterAll() {
		//close session factory
		System.out.println("After All Test Cases");
	}
	@BeforeEach
	public void setUp() {
		//open session object
		System.out.println("Before each test case");
	}
	@AfterEach
	public void tearDown() {
		//close session object
		System.out.println("After Each Test case");
	}
	@Test
	@DisplayName("Test for Data Insertion")
	public void test1() {
		System.err.println("Test case 1 executed");
	}
	@Disabled
	@Test
	@DisplayName("Test for Data Retrival")
	public void test2() {
		System.err.println("Test case 2 executed");
	}

}
