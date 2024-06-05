/**
 
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */


class Pattern9 {
    
    public static void main(String[] args) {
        
        int N = 5;
        
        printPattern9(N);
    }
    
    
    private static void printPattern9(int N){
        
        // 1st half traingle
        for(int i=0; i<N; i++){
            
            for(int j=0; j<N-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("**");
            }
            System.out.println("*");
        }
        
        // 2nd half triangle
        for(int i=0; i<N; i++){
            
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<N-i-1; j++){
                System.out.print("**");
            }
            System.out.println("*");
        }

    }
}