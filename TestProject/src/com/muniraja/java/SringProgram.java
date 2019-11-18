package com.muniraja.java;

public class SringProgram {

	public static void main(String[] args) {
		String s1="hello";
		String s2="java";
		String s=" ";
		System.out.println(s.equals(s2));
		String s3=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s2));
	}

}
