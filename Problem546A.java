//https://codeforces.com/problemset/problem/546/A

import java.util.Scanner;

public class Problem546A {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int n = sc.nextInt() * -1;
            int w = sc.nextInt();

        for (int i = 1; i <= w; i++) {
            n += i*k;
        }

        if(n <= 0){
            System.out.println(0);
        } else {
            System.out.println(n);
        }
}
}