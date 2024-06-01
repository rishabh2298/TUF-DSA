/**
 
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

 */


class Pattern4 {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int N = 5;
        
        pattern4(N);
    }
    
    private static void pattern4(int N){
        
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}