package com.bridgelab.userregistrationproblem;

/**************************************************************
 * @author mihir
 * 
 * This class represent the user details.
 * like first name, last name, email, phone number and password.
 **************************************************************/
public class UserDetails
{
	private String firstName;
	private String lastName;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		return "User-Details : [ First-Name = " + firstName + ", Last-Name = " + lastName + " ]";
	}
	
}
