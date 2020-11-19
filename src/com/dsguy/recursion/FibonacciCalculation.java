/**
 * 
 */
package com.dsguy.recursion;

import java.util.Scanner;

/**
 * @author Abhijeet Anand
 * Recursive method to calculate Fibonacci series.
 */
public class FibonacciCalculation {

	/**
	 * @param args
	 */
	
	public static int generate_Fibonacci(int n) {
		
	   if(n == 1 || n == 2)
		{
			return (n - 1);
		}
		else {
			return generate_Fibonacci(n-1) + generate_Fibonacci(n - 2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number upto which Fibonacci series to print: "); 
		int number = new Scanner(System.in).nextInt();
		if(number < 1) {
		   System.out.println("Please enter positive values");	
		}
		for(int i=1; i<=number; i++) {
			System.out.println("Fibonacci series is : " + generate_Fibonacci(i));
		}
         
	}

}
