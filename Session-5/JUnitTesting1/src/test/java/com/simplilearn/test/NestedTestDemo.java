package com.simplilearn.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("OuterClass")
public class NestedTestDemo {

	@BeforeEach
	public void setUp() {
		System.out.println("Before Each of Outer");
	}
	@AfterEach
	public void tearDown() {
		System.out.println("After Each of Outer");
	}
	@Test
	public void myTest() {
		System.out.println("Test case of Outer class");
	}
	@Nested
	class Inner{
		@BeforeEach
		public void setUpInner() {
			System.out.println("Before Each of Inner");
		}
		@AfterEach
		public void tearDownInner() {
			System.out.println("After Each of Inner");
		}
		@Test
		public void myTestInner() {
			System.out.println("Test case of Inner class");
		}
		@Nested
		class InnerX{
			@BeforeEach
			public void setUpInnerX() {
				System.out.println("Before Each of InnerX");
			}
			@AfterEach
			public void tearDownInnerX() {
				System.out.println("After Each of InnerX");
			}
			@Test
			public void myTestInnerX() {
				System.out.println("Test case of InnerX class");
			}
		}
	}
}
