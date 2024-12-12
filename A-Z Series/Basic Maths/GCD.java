/*

Enter numbers to find GDC : 
Enter number 1 : 12
Enter number 2 : 16

Highest Common Divisor (1) = 4
Highest Common Divisor (2) = 4

 */

import java.util.Scanner;

public class GCD {
	
	private static int findGcd1(int num1, int num2) {
		int gcd = 1;
		
		for(int i = Math.min(num1, num2); i>1; i--) {
			if(num1%i == 0 && num2%i == 0) {
				gcd = i;
				break;
			}
		}
		
		return gcd;
	}
	
	// euclidean algorithm
	private static int findGcd2(int num1, int num2) {
		
		while(num1>0 && num2>0) {
			if(num1 > num2) {
				num1 = num1 % num2;
			}
			else {
				num2 = num2 % num1;
			}
		}
		
		return (num1 == 0) ? num2 : num1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter numbers to find GDC : ");
		
		System.out.print("Enter number 1 : ");
		Integer num1 = scanner.nextInt();
		
		System.out.print("Enter number 2 : ");
		Integer num2 = scanner.nextInt();
		
		System.out.println("Highest Common Divisor (1) = " + findGcd1(num1, num2));

		System.out.println("Highest Common Divisor (2) = " + findGcd2(num1, num2));
	}
}


