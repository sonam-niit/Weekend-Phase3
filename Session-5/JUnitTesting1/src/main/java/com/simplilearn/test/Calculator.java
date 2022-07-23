package com.simplilearn.test;

public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return (b==0)? 0 : a/b;
	}
}
