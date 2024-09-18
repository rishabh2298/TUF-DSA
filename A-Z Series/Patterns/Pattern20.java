/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

=== Code Execution Successful ===

*/

class Pattern20 {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int N = 5;
        
        print19(N);
    }
    
    private static void print20(int  N){
        int spaces = 2*N - 2;
        // upper half
        for(int i=0; i<N; i++){
            // left
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            // right
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println();
        }
        
        spaces = 2;

        // lower half
        for(int i=0; i<N; i++){
            // left
            for(int j=0; j<N-i-1; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            // right
            for(int j=0; j<N-i-1; j++){
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }
        
    }
    
}
