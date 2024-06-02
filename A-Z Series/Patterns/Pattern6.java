/**
 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 */


class Pattern6 {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int N = 5;
        
        printPattern6(N);
    }
    
    
    private static void printPattern6(int N){
        for(int i=N; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    
}