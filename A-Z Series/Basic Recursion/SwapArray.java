/**
 * [1,2,3,4,5]
 * 
 * output = [5,4,3,2,1]
 * 
 */


import java.util.*;

public class Main{

	private static void solve(int idx, int N, int[] arr){

		if(idx >= N/2) return;

		swap(idx, N, arr);

		solve(++idx, N, arr);
	}

	private static void swap(int idx, int N, int[] arr) {
		int temp = arr[idx];
		arr[idx] = arr[N-idx-1];
		arr[N-idx-1] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size N :");
		int N = sc.nextInt();

		System.out.println("Enter the arrays :");
		int[] arr = new int[N];

		for(int i=0; i<N; i++){
			System.out.print("Enter value "+ (i+1) + " ");
			arr[i] = sc.nextInt();
			System.out.println();
		}

		solve(0, N, arr);

		System.out.println("Updated array :: " + Arrays.toString(arr));
	}
}