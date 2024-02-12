package com.exceptionhandling;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  m1();
 m2();
 m3();
 m4();
  m5();
	}
 static void m1()
 {
	 try
	 {
		 System.out.println("1");
		 System.out.println("2");
		 System.out.println("3");
		 System.out.println("4");
	 }
	 catch (Exception e) {
		System.out.println(50/2);
	} 
 }
 
 static void m2()
 {
	 try
	 {
		 System.out.println("1");
		 System.out.println(10/0);
		 System.out.println("3");
		 System.out.println("4");
	 }
	 catch (Exception e) {
		System.out.println(50/2);
	} 
 }
 
 static void m3()
 {
	 try
	 {
		 System.out.println("1");
		 System.out.println(10/0);
		 System.out.println("3");
		 System.out.println("4");
	 }
	 catch (NullPointerException e) {
		System.out.println("in catch block");
	} 
 }
 
 static void m4()
 {
	 System.out.println(50/0);
	 try
	 {
		 System.out.println("1");
		 System.out.println("2");
		 System.out.println("3");
		 System.out.println("4");
	 }
	 catch (Exception e) {
		System.out.println(50/2);
	} 
 }
 
 static void m5()
 {
	 try
	 {
		 System.out.println("1");
		 System.out.println("2");
		 System.out.println("3");
		 System.out.println("4");
	 }
	 
	 catch (Exception e) {
		System.out.println(50/2);
	} 
	 System.out.println(50/0);
 }
}
