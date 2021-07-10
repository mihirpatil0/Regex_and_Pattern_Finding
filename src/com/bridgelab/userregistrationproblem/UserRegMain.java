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
			System.err.println("Wrong Input : Fist letter Should be capital and must contains minimum 3 characters :");
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
		if(userDetailsObject.getFirstName() != null)
		{
			System.out.println(userDetailsObject);
		}
	}
	
	public static void main(String[] args)
	{
		UserRegMain userObject = new UserRegMain();
		
		//calling methods.
		userObject.enterFirstName();
		userObject.printAllUserDetails();
	}
}
