package com.simplilearn.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

public class ScriptBasedTest {

	public boolean mycondition() {
		return false;
	}
	
	@Test
	@EnabledIf("mycondition")
	public void testScript() {
		System.out.println("Executed");
	}
}
