package com.UserException;

public class UserCheckedException {

	public static void main(String[] args) throws CustomeCheckedException {
		// TODO Auto-generated method stub
		System.out.println("Inside Main");
		CustomeCheckedException.m1();
	}
    
}

class CustomeCheckedException extends Exception
{
	CustomeCheckedException(String a)
	{
	  super(a);	
	}
	
	static void m1() throws CustomeCheckedException 
    {
    	throw new CustomeCheckedException("in custom checked exception");
    }
}
