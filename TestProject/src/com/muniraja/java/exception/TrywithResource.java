package com.muniraja.java.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResource {

	

	public static void main(String[] args) {
		
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))){
			{
			
			}
		}
		catch(IOException e) {
			System.out.println("caught");
		}
	}

}
