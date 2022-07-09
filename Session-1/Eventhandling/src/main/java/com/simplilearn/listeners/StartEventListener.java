package com.simplilearn.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventListener implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Event Started Listener Executed");
		
	}

}
