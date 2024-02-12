package com.exceptionhandling;

public class ThrowDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	} 
	static void m1() throws CloneNotSupportedException//when we throw checked exception then we have to write throws keyword and that type of class after it
	{
		
		throw new CloneNotSupportedException();//throw writtens inside the method and multiple objects are not allowed after throw.
		                                      
	}
	static void m2()
	{
		throw new ArithmeticException(); //when we throw unchecked exception then we dont have to write throws keyword
	}

}


