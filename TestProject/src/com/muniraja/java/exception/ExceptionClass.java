package com.muniraja.java.exception;

public class ExceptionClass {

	public static void main(String[] args)  {
		System.out.println("exception");
		try {
		throw new CustomException("my exception");
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
