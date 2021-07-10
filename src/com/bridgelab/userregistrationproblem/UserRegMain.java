package com.bridgelab.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.*;

/**
 * @author mihir
 * 
 * This is the main class for user registration regex pattern validation problem.
 */

public class UserRegMain
{
	UserDetails userDetailsObject;
	Scanner scanner;
	
	//constructor
	public UserRegMain()
	{
		userDetailsObject = new UserDetails();
		scanner = new Scanner(System.in);
	}
	
	/**
	 * Name : enterFirstName.
	 * 
	 * Description : Asking user to enter first name.
	 * 
	 * Algorithm : Checking if entered name follows defined pattern rules or not.
	 * using regex.
	 * 
	 * Modification : First commit 10-July-2021.
	 */
	public void enterFirstName()
	{
		System.out.print("ENTER FIRST NAME : ");
		String firstName = scanner.next();
		//regex first character should be Capital letter and name should have minimum 3 characters.
		boolean isTrue = Pattern.compile("^[A-Z]{1}[A-z a-z]{2,}$").matcher(firstName).matches();
		if(isTrue == true)
		{
			userDetailsObject.setFirstName(firstName);
		}
		else
		{
			System.err.print("Wrong Input : Fist letter Should be capital and must contains minimum 3 characters :\n");
			System.out.println();
			enterFirstName();
		}
	}
	
	/**
	 * Name : enterLastName.
	 * 
	 * Description : Asking user to enter last name.
	 * 
	 * Algorithm : Checking if entered last name follows defined pattern rules or not.
	 * using regex.
	 * 
	 * Modification : First commit 10-July-2021.
	 */
	public void enterLastName()
	{
		System.out.print("ENTER LAST NAME : ");
		String lastName = scanner.next();
		//regex first character should be Capital letter and name should have minimum 3 characters.
		boolean isTrue = Pattern.compile("^[A-Z]{1}[A-z a-z]{2,}$").matcher(lastName).matches();
		if(isTrue == true)
		{
			userDetailsObject.setLastName(lastName);
		}
		else
		{
			System.err.print("\nWrong Input : Fist letter Should be capital and must contains minimum 3 characters :");
			System.out.println();
			enterLastName();
		}
	}
	
	/**
	 * Name : enterEmailId.
	 * 
	 * Description : Asking user to enter Email-Id.
	 * 
	 * Algorithm : Checking if entered email-id follows defined pattern rules or not.
	 * using regex.
	 * E.g. abc.xyz@bl.co.in
	 * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	 * 
	 * Modification : First commit 10-July-2021.
	 */
	public void enterEmailId()
	{
		System.out.print("ENTER EMAIL-ID : ");
		String emailId = scanner.next();
		
		boolean isTrue = Pattern.compile("^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$").matcher(emailId).matches();
		if(isTrue == true)
		{
			userDetailsObject.setEmailId(emailId);
		}
		else
		{
			System.err.print("\nWrong Input : E.g. abc.xyz@bl.co.in Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions ");
			System.out.println();
			enterEmailId();
		}
	}
	
	/**
	 * Name : enterMobileNumber.
	 * 
	 * Description : Asking user to enter mobile number.
	 * 
	 * Algorithm : Checking if entered mobile number follows defined pattern rules or not.
	 * using regex.
	 * example - 91 9987000000
	 * Rules : country code followed by space and 10 digit number.
	 * 
	 * Modification : First commit 10-July-2021.
	 */
	public void enterMobileNumber()
	{
		System.out.print("ENTER PHONE NUMBER : ");
		String mobileNumber = scanner.nextLine();
		boolean isTrue = Pattern.compile("^[0-9]\\d{1}\\s[789]\\d{9}$").matcher(mobileNumber).matches();
		if(isTrue == true)
		{
			userDetailsObject.setMobileNumber(mobileNumber);
		}
		else
		{
			System.err.print("\nWrong Input : Country code followed by space and 10 digit number :");
			System.out.println();
			enterMobileNumber();
		}
	}
	
	/**
	 * Name : enterPassword.
	 * 
	 * Description : Asking user to enter password.
	 * 
	 * Algorithm : Checking if entered password follows defined pattern rules or not.
	 * using regex.
	 * must contain 8 characters.
	 * Should have atleast one UPPER CASE.
	 * 
	 * Modification : First commit 10-July-2021.
	 */
	public void enterPassword()
	{
		System.out.print("ENTER PASSWORD : ");
		String password = scanner.next();
		boolean isTrue = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$").matcher(password).matches();
		if(isTrue == true)
		{
			userDetailsObject.setPassword(password);
		}
		else
		{
			System.err.print("\nWrong Input : Password must be of 8 characters, must contain one upper case, one number :");
			System.out.println();
			enterPassword();
		}
	}
	
	/**
	 * Name : printAllUserDetails.
	 * 
	 * Description : Printing User Details.
	 * 
	 * Algorithm : checking if first name is null or not.
	 * if it is not null then only printing user details.
	 * 
	 * Modification : First commit 10-July-2021.
	 */
	public void printAllUserDetails()
	{
		System.out.println("\n" + userDetailsObject);
	}
	
	public static void main(String[] args)
	{
		UserRegMain userObject = new UserRegMain();
		
		//calling methods.
		userObject.enterFirstName();
		userObject.enterLastName();
		userObject.enterEmailId();
		userObject.enterMobileNumber();
		userObject.enterPassword();
		userObject.printAllUserDetails();
	}
}
