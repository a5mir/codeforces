//https://codeforces.com/problemset/problem/282/A

import java.util.Scanner;

public class Problem231A {
	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
       String[] arr = new String[n];
       for(int i = 0; i<n; i++){
           arr[i] = sc.next().replace("X", "");
       }
       for(int i = 0; i<n; i++){
           if(arr[i].contains("++")){
               x++;
           }
           else {
               x--;
           }
       }
        System.out.println(x);
	}
}
