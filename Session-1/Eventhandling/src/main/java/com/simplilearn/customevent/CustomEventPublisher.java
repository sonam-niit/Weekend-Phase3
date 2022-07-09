package com.simplilearn.customevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;

	public void publish() {
		CustomEvent event= new CustomEvent("My Event");
		publisher.publishEvent(event);
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
}
