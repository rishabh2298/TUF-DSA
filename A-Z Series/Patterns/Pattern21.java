/*

*****
*   *
*   *
*   *
*****

=== Code Execution Successful ===

*/


class Pattern21 {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int N = 5;
        
        print21(N);
    }
    
    private static void print21(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i==0 || i==N-1 || j==0 || j==N-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
