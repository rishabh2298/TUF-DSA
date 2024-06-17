/**
 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15  

 */


class Pattern13 {
    
    public static void main(String[] args) {
        int N = 5;
        
        printPattern13(N);
    }
    

    // Approach - 1
    
    private static void printPattern13(int N){
        
        int count = 1;
        
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }


    // Approach - 2

    private static void printPattern13(int N){
        
        int tracker = 1;
        int count = 0;
        
        for(int i=1; i<=N; i++){
            System.out.print(i+" ");
            count++;
            if(count == tracker){
                tracker++;
                count = 0;
                System.out.println();
            }
        }
    }
}