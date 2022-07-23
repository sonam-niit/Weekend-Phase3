package com.simplilearn.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {

	@DisplayName("My Test")
	@RepeatedTest(value = 3, name = "TestCase: {displayName} the currentCount is "
			+ "{currentRepetition} out of {totalRepetitions}")
	public void mytest() {
		System.out.println("Test Executed");
	}
}
