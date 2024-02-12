package com.exceptionhandling;

public class ExceptionHandelingUsingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      m1();
	}
	static void m1()
	{
		System.out.println("first line");
		System.out.println("second line");
		System.out.println("third line");
		System.out.println("fourth line");
		
		try    //it is used for writing risky code
		{
			int a=10/0;
		}
		catch (Exception e) {  // it is used to write alternative code for risky code or to handle exception
			
			System.out.println(10/2); //writing handeling code in catch
			//e.printStackTrace(); //it is used to give detail information about exception
			//System.out.println(e.toString()); //it is used to give information about exception means exception name and what is the exception
			System.out.println(e.getMessage()); //it is used to give  information about excepttion means what is the exception.
		}
		System.out.println("fifth line");
		System.out.println("sixth line");
	}

}
