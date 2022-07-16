package com.simplilearn.demo;

public class ProductNotFoundException extends Exception{

	public ProductNotFoundException(String msg) {
		super(msg);
	}

	@Override
	public String toString() {
		return "ProductNotFoundException "
				+ "[Not Found with ID 0]";
	}
	
	
}
