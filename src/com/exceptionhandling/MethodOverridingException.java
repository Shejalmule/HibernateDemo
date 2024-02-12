package com.exceptionhandling;

import java.io.IOException;

public class MethodOverridingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class A
{
	//for checked exception
	void m1() throws CloneNotSupportedException//if parent method throws any exception then child method should have same exception
                                               // or child of that exception or if any exception not throws then it will be okay.
	{
		System.out.println("inside m1 method of parent class");
	}
	void m2() throws IOException 
	{
		System.out.println("inside m2 method of parent class");
	}
	
	//for unchecked exception-no rules
	void m3()throws ArithmeticException
	{
		System.out.println("inside m3 method of parent class");
	}
	void m4()
	{
		System.out.println("inside m4 method of parent class");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("inside m1 method of child class");
	}
	void m2() throws IOException  //if child method throws any exception then parent method should throws same exception 
	                              //or parent of that exception.
	{
		System.out.println("inside m2 method of child class");

	}
	
	//for unchecked exception
	void m3() 
	{
		System.out.println("inside m3 method of child class");
	}
	
	void m4()throws ArithmeticException //no rules to throw any exception in parent class method.
	{
		System.out.println("inside m4 method of child class");
    }
}