//https://codeforces.com/problemset/problem/158/A

import java.util.Scanner;

public class Problem158A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //broj ucesnika
                int k = sc.nextInt(); // ocjena ucesnika na poziciji 5
                int co = 0;
                int[] arr = new int[n];
                for(int i = 0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                for(int i= 0; i<arr.length; i++){
                    if(arr[k-1] <= arr[i] && arr[i] > 0){
                        co++;
                    }
                }
                System.out.println(co);
	}
}
