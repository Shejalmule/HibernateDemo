package com.exceptionhandling;

public class ExceptionHandelingUsingFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a= m1();
    System.out.println(a);
		m2();
	}
	static int m1()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try {
			System.out.println("inside try");
			int a=10/0;
			return 5;
		}
		catch (Exception e) {  // catch block will only execute if exception occurs
			System.out.println("inside catch");
			e.printStackTrace();
			return 2;
		}
		finally {  // finally block will execute even if exception occur or not
			System.out.println("inside finally block");
			return 3;  //it is called as deemed concept because if there is exception in try so return statement should be execute from catch 
		}              //but finally is executed even if exxception occurs or not so we will get return statement from exception.
	}
	
	static void m2()
	{
		try
		{
			//System.exit(0);  // when this write then finally will not execute
			int a=10/0;
		}
		catch (ArithmeticException e) {
			System.out.println("inside arithmeti exception block");
		}
		catch (Exception e) {
			System.out.println("inside exception block");
		}
		finally {
			System.out.println("insidde finally block");
		}
	}
}
