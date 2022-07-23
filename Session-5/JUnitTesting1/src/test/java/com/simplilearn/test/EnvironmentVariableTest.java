package com.simplilearn.test;

import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvironmentVariableTest {

	@Disabled
	@Test
	public void getEnvironmentVariables() {
		Map<String, String> map=System.getenv();
		map.forEach((k,v)->System.out.println(k+" : "+v));
	}
	@Test
	@EnabledIfEnvironmentVariable(named="NUMBER_OF_PROCESSORS",
	matches = "4")
	public void onProcessor4() {
		System.out.println("Run this if it has 4 processors");
	}
	@Test
	@EnabledIfEnvironmentVariable(named="PROCESSOR_IDENTIFIER",
	matches = ".*Intel64 Family 6.*")
	public void onIntel64() {
		System.out.println("Run this on Intel 6 family only");
	}
}
