/*
    10 9 8 7 6 5 4 3 2 1 
*/

import java.util.*;

public class Main{

    private static  void printNto1(int idx, int N) {
        if(idx < 1)
            return;

        System.out.print(idx + " ");
        printNto1(idx-1, N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printNto1(N, N);
        System.out.println();
    }
}
