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
			input = sc.nextLine();
			String regex = "^[A-Z][a-z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if(matcher.find())
				break;
			else 
				System.err.println("Invalid First Name !  Please try again...");
		}
		return input;
	}
	public String checkLastName() {
		String input = null;
		while(true) {
			System.out.println("\nEnter Last Name\n");
			input = sc.nextLine();
			String regex = "^[A-Z][a-z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if(matcher.find())
				break;
			else 
				System.err.println("Invalid Last Name !  Please try again...");
		}
		return input;
	}
	public String checkEmail() {
		String input = null;
		while(true) {
			System.out.println("\nEnter e-mail\n");
			input = sc.nextLine();
			String regex = "^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@][a-z1-9]+[/.][a-z]{2,3}([/.]?[a-z]{2,3})?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if(matcher.find())
				break;
			else 
				System.err.println("Invalid email !  Please try again...");
		}
		return input;
	}
	public String checkMobile() {
		String input = null;
		while(true) {
			System.out.println("\nEnter Mobile Number    e.g., 91 9988557744");
			input = sc.nextLine();
			String regex = "^[0-9]{1,3}[ ][6-9]{1}[0-9]{9}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if(matcher.find())
				break;
			else 
				System.err.println("Invalid Mobile Number !  Please try again...");
		}
		return input;
	}
	public String checkPassword() {
		String input = null;
		while(true) {
			System.out.println("\nEnter Password ( min 8 characters , one uppercase , one number , one special char )\n");
			input = sc.nextLine();
			String regex = "(?=.{8,})(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[^a-zA-Z0-9 ][a-zA-Z0-9]*";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			if(matcher.find())
				break;
			else 
				System.err.println("Invalid Password !  Please try again...");
		}
		return input;
	}
	public void emailValidation() {
		System.out.println("*** Sample email check ***");
		String[] emails = new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
				"abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
				"abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
				"abc@gmail.com.aa.au" };
		
		for (String currentEmail : emails) {
			boolean result = 
			currentEmail.matches("^(abc)([-/./+_]?[a-z0-9]+)?[a-z0-9]*[@][a-z1-9]+[/.][a-z]{2,3}([/.]?[a-z]{2,3})?$");
			
			System.out.println("\n" + currentEmail + ": " + result);
		}	
	}
	
	public static void main(String[] args) {
		
		System.out.println("***** Welcomt to User Registration System ***** ");
		User user = new User();
		String firstName = user.checkFirstName();
		String lastName = user.checkLastName();
		String email = user.checkEmail();
		String mobile = user.checkMobile();
		String password = user.checkPassword();
		System.out.println("\nUser Details :\n" + "Name: " + firstName + " " + lastName + "\nemail: " + email + "\nMobile: " + mobile + "\n" );
		user.emailValidation();
	}

}
