package com.exceptionhandling;

public class ExceptionHandelingUsingThrows {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
   m1();
	}
	static void m1() throws CloneNotSupportedException
	{
		m2();
	}
	static void m2() throws CloneNotSupportedException
	{
		ExceptionHandelingUsingThrows o=new ExceptionHandelingUsingThrows();
		o.clone();
	}

}
