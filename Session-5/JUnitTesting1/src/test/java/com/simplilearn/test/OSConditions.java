package com.simplilearn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class OSConditions {

	@Test
	@EnabledOnOs(value = OS.WINDOWS)
	public void runOnWindows() {
		System.out.println("This test case will run on Windows OS");
	}
	@Test
	@DisabledOnOs(value = OS.MAC)
	public void runNotOnMac() {
		System.out.println("This test case will not run on MAC OS");
	}
	@Test
	@EnabledOnOs(value = OS.MAC)
	public void runOnMac() {
		System.out.println("This test case will run on MAC OS");
	}

	@Test
	@EnabledOnOs(value = OS.LINUX)
	public void runONLinux() {
		System.out.println("This test case will run on Linux OS");
	}
}
