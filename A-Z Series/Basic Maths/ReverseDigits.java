

/*
 Insert a number to reverse = 123456
 Reverse the digits = 654321
 
 */

import java.util.Scanner;

public class ReverseDigits {
	
	private static long  reverseDigits(long num) {
		long result = 0L;
		
		while(num > 0) {
			int lastDigit = (int)num % 10;
			num /= 10;
			result = result*10 + lastDigit;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insert a number to reverse = ");
		long number = scanner.nextLong();
		
		System.out.println("Reverse the digits = " + reverseDigits(number));
		scanner.close();
	}
	
}

