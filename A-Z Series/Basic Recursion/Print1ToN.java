/*
    1 2 3 4 5 6 7 8 
*/

import java.util.*;

public class Main{

    private static void print1ToN(int idx, int N) {
        if(idx > N) 
            return;

        System.out.print(idx + " ");
        print1ToN(idx + 1, N);
    }

    public static void main(String[] args) {
        print1ToN(1, 8);
        System.out.println();
    }
}

