package OveroadingExample;

public class Mltply
{
	//Method overloading means  Same method name with different parameter is called overloading 
	//That is also called comple time poly morephisum or early binding why we are saying becouse complier is dicided at comple time which method have to cal 
	//example if we pass two parameter then two paramatrize method will be called
	
	// Created method name mul with two arguments 
	
		 void mul(int a, int b) 
		 {
		  System.out.println("Sum of two=" + (a * b));
		 }

			// Created method name mul with different arguments
		 void mul(int a, int b, int c) 
		 {
		  System.out.println("Sum of three=" + (a * b * c));
		 }
		}
//created another class with Poly
		class Polymorphism 
		{
		 public static void main(String args[]) 
		 {
			 // Created object for class
			  //pass two arguments 
		  Mltply m = new Mltply();

		  m.mul(6, 10);
		  //pass three arguments 
		  m.mul(10, 6, 5);
		 }
		}

// Some more points is :- method overloading we can achieve in single class but we can not achieve in difeerent class
		


