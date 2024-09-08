/*

E 
D E 
C D E 
B C D E 
A B C D E 

=== Code Execution Successful ===

*/


class Pattern18 {
    public static void main(String[] args) {
        int N = 5;
        printPatter18(N);
    }
    
    private static void printPatter18(int N){
        for(int i=1; i<=N; i++){
            StringBuilder ans = new StringBuilder("");
            for(int j=N-i+1; j<=N; j++){
                ans.append((char)(64+j)+" ");
            }
            System.out.println(ans.toString());
        }
    }
}
