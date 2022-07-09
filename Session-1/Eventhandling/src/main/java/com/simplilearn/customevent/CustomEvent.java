package com.simplilearn.customevent;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

	public CustomEvent(String source) {
		super(source);
	}

	@Override
	public String toString() {
		return "CustomEvent [source=" + source + "]";
	}

}
