//https://codeforces.com/problemset/problem/231/A

import java.util.Scanner;

public class Problem231A {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int co2 = 0;
        int[] arr = new int[3];
        
        for(int j = 0; j < n; j++){
            int co1 = 0;
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();  
            
        }
        for(int i = 0; i<3; i++){
            if(arr[i] == 1){
                co1++;
            } 
        }
        if(co1 >= 2){
            co2++;
        }
        }
        
        System.out.println(co2);

	}
}
