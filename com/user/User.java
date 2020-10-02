package com.user;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	Scanner sc = new Scanner(System.in);
	
	public String firstName() {
		String firstName = null;
		while(true) {
			System.out.println("Enter first Name");
			firstName = sc.next();
			String regex = "^[A-Z][a-z]{2,}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(firstName);
			if(matcher.find())
				break;
			else
				System.out.println("Invalid Name ! ");
		}
		return firstName;
	}
	
	public static void main(String[] args) {
		
		User user = new User();
		String firstName = user.firstName();
	}

}
