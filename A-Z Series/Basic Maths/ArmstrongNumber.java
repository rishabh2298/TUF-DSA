
/*
Check if number is Armstrong or not = 153
153 = 153
Result = true
*/

import java.util.Scanner;

public class ArmstrongNumber {
    
    private static boolean checkArmstrong(long num) {
        long comp = num;
        long result = 0L;
       
        while(num > 0) {
            int lastDigit = (int)num % 10;
            result += lastDigit * lastDigit * lastDigit;
            num = (int)num/10;
        }
       
        System.out.println(comp + " = " + result);
        if(comp == result){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Check if number is Armstrong or not = ");
        Long number = scanner.nextLong();
       
        System.out.println("Result = " + checkArmstrong(number));
        scanner.close();
    }
    
}

