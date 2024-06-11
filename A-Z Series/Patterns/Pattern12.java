/**
 
1        1
12      21
123    321
1234  4321
1234554321

 */

class Pattern12 {
    
    public static void main(String[] args) {
        
        int N = 5;
        printPattern12(N);
    }
    
    private static void printPattern12(int N){
        
        for(int i=1; i<=N; i++){
            int count = N;
            
            // forward print
            for(int j=1; j<=i; j++){
                System.out.print(j);
                count--;
            }
            
            // printing spaces
            for(int j=1; j<=count*2; j++){
                System.out.print(" ");
            }
            
            // backward print
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}