
/*
 Insert number/characters to check pallindrome = 145541
 true

 */

import java.util.Scanner;

public class CheckPallindrome {
    
    private static boolean checkPallindrome(String str) {
        int l = 0;
        int h = str.length()-1;
        
        while(l < h) {
            if(str.charAt(l++) != str.charAt(h--)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insert number/characters to check pallindrome = ");
        String string = scanner.nextLine();
        
        System.out.println(checkPallindrome(string));
        scanner.close();
    }
    
}

