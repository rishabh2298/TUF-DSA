// Link : https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

/*

* 
* * 
* * * 
* * * * 
* * * * * 

 */


class Pattern2 {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int N = 5;
        
        pattern2(N);
    }
    
    private static void pattern2(int N){
        
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}