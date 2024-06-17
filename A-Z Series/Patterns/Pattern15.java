/**
 
ABCDE
ABCD
ABC
AB
A

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
        }
        
        while(str.length() > 0){
            System.out.println(str);
            str.deleteCharAt(str.length()-1);
        }
    }
}