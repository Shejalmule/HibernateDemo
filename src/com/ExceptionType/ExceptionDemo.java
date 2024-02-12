package com.ExceptionType;

public class ExceptionDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		m3();
	}
    static void m1()
    {
    	System.out.println("inside m1 method");
    	int a=10/0;
    }
    
    static void m2()
    {
    	m1();
    	System.out.println("inside m2 method");
    	
    }
    
    static void m3()
    {
    	m2();
    	System.out.println("inside m3 method");
    	
    }
    
    
}
