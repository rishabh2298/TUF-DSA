/**

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 
 */


class Pattern17 {
    
    public static void main(String[] args) {
        int N = 5;
        
        printPattern17(N);
    }
    
    private static void printPattern17(int N){
        
        for(int i=1; i<=N; i++){
            // printing spaces
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            
            // print characters
            // forward + 'A'
            StringBuilder result = new StringBuilder("");
            for(int j=1; j<=i; j++){
                result.append((char)(64+j));
            }
            
            // reverse
            for(int j=i-1; j>0; j--){
                result.append((char)(64+j));
            }
            
            System.out.println(result.toString());
        }
    }
}