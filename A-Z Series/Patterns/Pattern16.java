/*
 
A
BB
CCC
DDDD
EEEEE

 */


class Pattern16 {
    
    public static void main(String[] args) {
        int N = 5;
        
        printPattern16(N);
    }
    
    private static void printPattern16(int N){
        
        for(int i=1; i<=N; i++){
            StringBuilder str = new StringBuilder("");
            for(int j=1; j<=i; j++){
                str.append((char)(64+i));
            }
            System.out.println(str.toString());
        }
    }
}