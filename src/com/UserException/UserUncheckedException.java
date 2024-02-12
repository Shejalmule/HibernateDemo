package com.UserException;

public class UserUncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomUncheckedException.m1();
	}

}
class CustomUncheckedException extends RuntimeException
{
	CustomUncheckedException(String s)
	{
		super(s);
	}
	
	static void m1()
	{
		throw new CustomUncheckedException("in custom unchecked exception");
	}
}
