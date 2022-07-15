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
}
