package com.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	Scanner sc = new Scanner(System.in);
	
	public String checkFirstName() {
		String input = null;
		while(true) {
			System.out.println("\nEnter First Name\n");
			input = sc.next();
			String regex = "^[A-Z][a-z]{2,}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if(matcher.find())
				break;
			else 
				System.out.println("Invalid First Name !  Please try again...");
		}
		return input;
	}
	
	public static void main(String[] args) {
		
		System.out.println("***** Welcomt to User Registration System ***** ");
		User user = new User();
		String firstName = user.checkFirstName();
	}

}
