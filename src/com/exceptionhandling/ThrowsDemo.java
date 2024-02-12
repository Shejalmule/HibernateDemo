package com.exceptionhandling;

import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void m1() throws CloneNotSupportedException  //throws wrriten with method signiture and multiple classes allowed after throws
	{
		ThrowsDemo s1=new ThrowsDemo();
	    s1.clone();	
	}
	
	static void m2() throws ArithmeticException  //no need to throw something if we write classname after throws
	{
		
	}
	
	static void m3() throws FileNotFoundException  //no need to throw something if we write classname after throws
	{
		m2();
	}

}
