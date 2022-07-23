package com.simplilearn.test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.*;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class DynamicTestDemo {

	@TestFactory
	public Collection<DynamicTest> myTests(){
		
		return Arrays.asList(
				dynamicTest("Test 1", ()->assertTrue(67>12)),
				dynamicTest("Test 2", ()->assertFalse(0>1)),
				dynamicTest("Test 3", ()-> assertEquals(12, 8+4)),
				dynamicTest("Test 4", ()-> assertNull(null)),
				dynamicTest("Test 5", ()-> assertThrows(RuntimeException.class, 
						()->{throw new RuntimeException("Not valid");})),
				dynamicTest("Test 6", new MyExecutable())
				);
	}
}
class MyExecutable implements Executable{

	@Override
	public void execute() throws Throwable {
		System.out.println("My Executable class");
	}
	
}
