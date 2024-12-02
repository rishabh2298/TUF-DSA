
import java.util.Scanner;

public class CheckPrime {

	private static boolean checkPrime(int num) {
		int count = 0;

		for(int i=2; i*i<num; i++) {
			count += (num % i == 0) ? 1 : 0;
		}

		return (count == 0) ? true : false;
	}

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number to check prime = ");
		Integer num = scanner.nextInt();

		System.out.println("Result = " + checkPrime(num));
		scanner.close();
	}

}
