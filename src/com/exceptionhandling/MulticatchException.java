package com.exceptionhandling;

public class MulticatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    m1();
	}
	static void m1()
	{
		try {
			//int a=10/0;	
			
//			String s=null;
//			s.length();
			String s1="abc123";
			Integer.parseInt(s1);
		}
		
		catch (ArithmeticException e) {
			System.out.println("inside arithmetic exception");
		}
		catch (NumberFormatException e) {
			System.out.println("inside number format exception");
		}
		catch (NullPointerException e) {
			System.out.println("inside null pointer exception");
		}
		catch (Exception e) {
			int a=10/2;
			System.out.println("inside default exception ");
			
		}
	}

}
