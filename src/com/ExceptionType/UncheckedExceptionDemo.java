package com.ExceptionType;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmeticExceptionDemo();
		//nullPointerException();
		//numberFormatException();
		//arrayIndexOutOfBoundsExceptionDemo();
		stringIndexOutOfBoundsExceptionDemo();
	}
	static void arithmeticExceptionDemo()
	{
		int a=10/0;  //ArithmeticException
	}
	static void nullPointerException()
	{
		String s=null;
		s.length();  //NullPointerException
	}
	static void numberFormatException()
	{
		String s="123";
		int a=Integer.parseInt(s);
		System.out.println("string to int "+a);
		
		String s1="123abc";    //NumberFormatException
		int b=Integer.parseInt(s1);
		System.out.println("string to int "+b);
	}
	static void arrayIndexOutOfBoundsExceptionDemo()
	{
		int array[]=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		System.out.println(array[5]);  //ArrayIndexOutOfBoundsException
	}
	static void stringIndexOutOfBoundsExceptionDemo()
	{
		String s="abc";
		s.charAt(6);   //ArrayIndexOutOfBoundsException
	}

}
