/*

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

// TC=O(N^2)  SC=(1)

class Pattern19 {
    public static void main(String[] args) {
        int N = 5;
        
        print19(N);
    }
    
    private static void print19(int N){
        int initialSpaces = 0;
        
        // upper half
        for(int i=0; i<N; i++){
            // left
            for(int j=0; j<N-i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0; j<initialSpaces; j++){
                System.out.print(" ");
            }
            // right
            for(int j=0; j<N-i; j++){
                System.out.print("*");
            }
            initialSpaces += 2;
            System.out.println();
        }
        
        initialSpaces = 2*N - 2;
        
        // lower half
        for(int i=0; i<N; i++){
            // left
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0; j<initialSpaces; j++){
                System.out.print(" ");
            }
            // right
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            initialSpaces -= 2;
            System.out.println();
        }
    }
}