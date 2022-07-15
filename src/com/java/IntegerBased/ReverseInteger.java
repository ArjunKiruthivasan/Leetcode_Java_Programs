package com.java.IntegerBased;

public class ReverseInteger {
	public int reversDigits(int x) {
		int reverse = 0;
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		// INT_MAX is equal 2147483647. INT_MIN is equal  -2147483648. 
		
		while(x != 0) {
			int lastDigit = x % 10;
			x /= 10 ;

			if(reverse > max/10 || reverse == max/10 && lastDigit > 7){
				return 0 ;
			}

			if(reverse < min/10 || reverse == min/10 && lastDigit < -8){
				return 0 ;
			}

			reverse = reverse * 10 + lastDigit;
		}


		return reverse;
	}
	
	public boolean isPalindrome(int x) {
		// if the number is a negative number
		// if the number end with 0 except the number zero
		if (x < 0 || (x != 0 && x%10 == 0))
			return false;
		int reverse = 0;
		int num = x;
		
		while(num > reverse) {
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num /= 10;
		}
		return num == reverse/10 || num == reverse;
	}
}
