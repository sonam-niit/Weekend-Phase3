package com.simplilearn.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JREConditionTest {

	@Test
	@EnabledOnJre(value = JRE.JAVA_18)
	public void runOnJRE18() {
		System.out.println("This test case will run on JRE 18");
	}
	
	@Test
	@EnabledOnJre(value = {JRE.JAVA_16, JRE.JAVA_10} )
	public void runOnJRE16() {
		System.out.println("This test case will run on JRE 16");
	}
	
	@Test
	@EnabledOnJre(value = JRE.JAVA_14)
	public void runOnJRE14() {
		System.out.println("This test case will run on JRE 14");
	}
	@Test
	@DisabledOnJre(value = JRE.JAVA_14)
	public void notRunOnJRE14() {
		System.out.println("This test case will not run on JRE 14");
	}
}
