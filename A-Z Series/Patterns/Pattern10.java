/**

with spaces

*####
**###
***##
****#
*****
****#
***##
**###
*####


without spaces

*
**
***
****
*****
****
***
**
*

 */


class Pattern10 {
    
    public static void main(String[] args) {
        
        int N = 5;
        
        printPattern10(N);
    }
    
    private static void printPattern10(int N){
        
        for(int i=0; i<N; i++){
            
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=i; j<N-1; j++){
                // System.out.print("#");
            }
            System.out.println();
        }
        
        for(int i=0; i<N-1; i++){
            
            for(int j=0; j<N-1-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<=i; j++){
                // System.out.print("#");
            }
            System.out.println();
        }
    }
    
}