package com.java.IntegerBased;

public class IntegerSolutions {
	public static void main(String args[]) {
		/*
		 * 1. Write a program that outputs the string representation of numbers from 1 to n.
		 * 
		 * But for multiple of three it should print "Fizz" instead of the number 
		 * 
		 * And for the multiples of "Buzz".
		 * 
		 * For numbers which are multiples of both three and five print "FizzBuzz". 
		 */
		FizzBuzz fb = new FizzBuzz();
		System.out.println(fb.fizzBuzz(20));
		
		/*
		 *  2. Given a non-empty array of integers nums, 
		 *  
		 *  every element appears twice except for one. Find the single one.
		 *  
		 *  You must implement a solution with a linear runtime complexity and 
		 *  use only constant extra space.
		 */
		SingleNumber sn = new SingleNumber();
		int[] num = {2,1,3,2,3};
		// Method of bruce force algorithm
		System.out.println(sn.singleNumber(num));
		// Method of Linear time constant space
		System.out.println(sn.singleNumberUsingXOR(num));
		
		/*
		 * Write a program to reverse an integer assuming that the input is a 32-bit integer. 
		 * 
		 * If the reversed integer overflows, print 0 as the output. 
		 */
		ReverseInteger rev = new ReverseInteger();
//		int number = 12345;
//	    System.out.println("Reverse of no. is " + rev.reversDigits(number) );
//	 
//	    number = 1000000045;
//	    System.out.println("Reverse of no. is " + rev.reversDigits(number) );
	    
	    int number = -7895;
	    System.out.println("Reverse of no. is " + rev.reversDigits(number) );
	}
}
