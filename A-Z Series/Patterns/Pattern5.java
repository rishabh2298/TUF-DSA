/**
 
* * * * * 
* * * * 
* * * 
* * 
* 

 */


class Pattern5 {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int N = 5;
        
        pattern5(N);
    }
    
    private static void pattern5(int N){
        
        for(int i=N; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}