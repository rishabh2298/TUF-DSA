
/**
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

 */


class Pattern3 {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int N = 5;
        
        pattern3(N);
    }
    
    private static void pattern3(int N){
        
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}