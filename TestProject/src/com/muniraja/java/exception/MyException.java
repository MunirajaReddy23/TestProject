package com.muniraja.java.exception;

public class MyException {

	public static void main(String[] args) {
		//in this case main method creates exception object and handover to the jvm at runtime
		//System.out.println(10/0);
//in this case programmer creates exception object explicitly and handover to the jvm at compile time
		//so if u write anything after throw stmt u will get an compile time exception
		throw new ArithmeticException("/by zero");
		
		
	}

}
