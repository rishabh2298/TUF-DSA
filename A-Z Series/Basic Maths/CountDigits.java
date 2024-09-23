/*
Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
*/

class CountDigits{
    
    static int evenlyDivides(int N){
        int count = 0;
        int compare = N;
        while(N > 0){
            int ld = N % 10;
            if(ld > 0 && compare % ld == 0) count++;
            N /= 10;
        }
        
        return count;
    }
}