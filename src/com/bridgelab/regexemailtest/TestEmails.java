package com.bridgelab.regexemailtest;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*******************************************************************************************************
 * @author mihir
 * 
 * @since 10-July-2021
 * In this class checking different type of email's validation using regex.
 * Storing email's in ArrayList ,and checking each email from arrayList against regex defined email rule.
 * If email passes regex expression output printing as true else falls.
 *******************************************************************************************************/

public class TestEmails 
{
	public static void main(String[] args)
	{
		//storing all the email's inside arraylist.
		ArrayList<String> emails = new ArrayList<String>();
		
		//valid email-ids as per given uc input.
		emails.add("abc@yahoo.com");
		emails.add("abc-100@yahoo.com");
		emails.add("abc.100@yahoo.com");
		emails.add("abc111@abc.com");
		emails.add("abc-100@abc.net");
		emails.add("abc.100@abc.com.au");
		emails.add("abc@1.com");
		emails.add("abc@gmail.com.com");
		emails.add("abc+100@gmail.com");
		 
		//Invalid emails
		emails.add("abc");
		emails.add("abc@.com.my");
		emails.add("abc123@gmail.a");
		emails.add("abc123@.com");
		emails.add(".abc@abc.com");
		emails.add("abc()*@gmail.com");
		emails.add("abc@%*.com");
		emails.add("abc..2002@gmail.com");
		emails.add("abc.@gmail.com");
		emails.add("abc@abc@gnail.com");
		emails.add("abc@gmail.com.1a");
		emails.add("abc@gmail.com.aa.au");
		 
		//regex email id verification pattern / rule's.
		String regex = "^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$";
		
		Pattern pattern = Pattern.compile(regex);
		int i = 1;
		//for each loop inside it printing the output true or false. that represent pattern matched or not.
		for(String email : emails)
		{
		    Matcher matcher = pattern.matcher(email);
		    System.out.println(i++ + "\t" + email +" : "+ "\t\t" + matcher.matches());
		    System.out.println("---------------------------------");
		}
	}
}
