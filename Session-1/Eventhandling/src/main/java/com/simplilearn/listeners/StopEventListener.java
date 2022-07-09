package com.simplilearn.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventListener implements ApplicationListener<ContextStoppedEvent>{

	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Stop event listener called");
		
	}

}
