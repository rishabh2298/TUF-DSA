/**
 
    *
   ***
  *****
 *******
*********

 */


class Pattern7 {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int N = 5;
        
        printPattern7(N);
    }
    
    
    private static void printPattern7(int N){
        
        for(int i=N; i>0; i--){
            // print void spaces
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            
            // print stars
            for(int j=N; j>i; j--){
                System.out.print("**");
            }
            // extra star
            System.out.println("*");
            
        }
        
    }
    
}