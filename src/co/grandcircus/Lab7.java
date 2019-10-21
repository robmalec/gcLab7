package co.grandcircus;

import java.util.Scanner;

public class Lab7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a name:");
		if (scn.hasNext()) {
			if (isValidName(scn.next())) {
				System.out.println("The name is valid!");
			}
			else
			{
				System.out.println("Invalid name entered.");
				scn.nextLine();
			}
		}
		else
		{
			System.out.println("No name entered.  Great job.  Moving on....");
		}
		
		System.out.println("Please enter an email:");
		if (scn.hasNext()) {
			if (isValidEmail(scn.next())) {
				System.out.println("The email is valid!");
			}
			else {
				System.out.println("Invalid email entered");
				scn.nextLine();
			}
		}
		else {
			System.out.println("No email entered.  Great job.  Your mother would be proud.  Moving on....");
		}
		
		System.out.println("Please enter a phone number:");
		if (scn.hasNext()) {
			if (isValidPhoneNum(scn.next())) {
				System.out.println("The phone number is valid!");
			}
			else {
				System.out.println("Invalid phone number entered");
				scn.nextLine();
			}
		}
		else {
			System.out.println("No phone number entered.  Excellent work.  Way to go.  Congratulations.  Moving on....");
		}
		
		System.out.println("Please enter a date:");
		if (scn.hasNext()) {
			if (isValidDate(scn.next())) {
				System.out.println("The date is valid!");
			}
			else {
				System.out.println("Invalid date entered");
				scn.nextLine();
			}
		}
		else {
			System.out.println("No phone number entered.  You really ought to win the nobel prize for this amazing work that you've displayed here today.  Moving on....");
		}


	}
	
	public static boolean isValidName(String name) {
		return doesMatch(name, "[A-Z][A-Za-z]{0,29}");
	}
	
	public static boolean isValidEmail(String email) {
		return doesMatch(email, "[A-Za-z0-9]{5,30}[@][A-Za-z0-9]{5,10}[.][a-z]{2,3}");
	}
	
	public static boolean isValidPhoneNum(String phoneNum) {
		return doesMatch(phoneNum, "([0-9]{3}[-])([0-9]{3}[-])([0-9]{4})");
	}
	
	public static boolean isValidDate(String date) {
		return doesMatch(date, "([0-9]{2}[/])([0-9]{2}[/])([0-9]{4})");
	}
	
	public static boolean doesMatch(String s, String pattern) {
		return s.matches(pattern);
	}

}
