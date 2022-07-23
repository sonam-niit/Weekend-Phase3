package com.simplilearn.test;

import java.util.Properties;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertyTest {

	@Disabled
	@Test
	public void printSystemProperties() {
		
		Properties properties= System.getProperties();
		properties.forEach((k,v)-> System.out.println(k + " : "+v));
	}
	@Test
	@EnabledIfSystemProperty(named ="java.vm.name", matches = ".*OpenJDK.*" )
	void onOpenJDK() {
		System.out.println("Run this on Open JDK");
	}
	@Test
	@EnabledIfSystemProperty(named = "user.country",matches = "IN")
	void runOnCountryIndia() {
		System.out.println("Run only for the Country Code India");
	}
}
