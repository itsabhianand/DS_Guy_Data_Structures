/**
 * 
 */
package com.dsguy.recursion;

/**
 * @author Abhijeet Anand
 * Recursive method to calculate Factorials.
 *
 */
public class FactorialCalculation {

	/**
	 * @param args
	 */
	public static int calculate_Factorial(int n)
	{
		if(n <= 0)
		{
			return 1;
		}
		else {
			return(n * calculate_Factorial(n - 1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial of given input number is " + calculate_Factorial(4));
	}

}
