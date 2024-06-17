/**
 
A
AB
ABC
ABCD
ABCDE 

 */


class Pattern14 {
    
    public static void main(String[] args) {
        int N = 5;
        
        printPattern14(N);
    }
    
    private static void printPattern14(int N){
        
        StringBuilder str = new StringBuilder("");
        
        for(int i=1; i<=N; i++){
            str.append((char)(64+i));
            System.out.println(str);
        }
    }
}