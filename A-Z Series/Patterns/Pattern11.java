/**
 
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 

 */


class Pattern11 {
    
    public static void main(String[] args) {
        
        int N = 6;
        
        printPattern11(N);
    }
    
    
    private static void printPattern11(int N){
        
        int value = 1;
        
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print(value+" ");
                value = (value==1) ? 0 : 1;
            }
            value = (i%2==0) ? 0 : 1;
            System.out.println();
        }
    }
}