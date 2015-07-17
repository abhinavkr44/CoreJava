package com.bunty.example;

public class NativeExample {
	public native void displayHelloWorld();
	
	static {
		System.loadLibrary("hello");
	}
	
	public static void main(String[] args) {
		new NativeExample().displayHelloWorld();
	}

}
