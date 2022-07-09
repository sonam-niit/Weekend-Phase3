package com.simplilearn.customevent;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent>{

	public void onApplicationEvent(CustomEvent event) {
		System.out.println("Custom Event Called");
		System.out.println(event.toString());
		
	}
	
}
