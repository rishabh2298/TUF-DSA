
/*
Enter number to find all divisors = 36
[1, 2, 3, 4, 6, 9, 12, 18, 36] 
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintAllDivisors {
	
	private static ArrayList<Integer> findDivisors(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i*i<=num; i++) {
			
			if(num % i == 0) {
				list.add(i);
				
				if(num / i != i) {
					list.add(num / i);
				}
			}
		}
		
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number to find all divisors = ");
		Integer number = scanner.nextInt();
		
		System.out.println(findDivisors(number));
		scanner.close();
	}
	
}

