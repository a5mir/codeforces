//https://codeforces.com/problemset/problem/116/A

import java.util.Scanner;

public class Problem116A {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int o;
            int i;
            int h = 0;
            int prim = 0;

        for (int j = 0; j < n; j++) {
            o = sc.nextInt();
            i = sc.nextInt();
            h += (-o + i);
            if(h > prim){
                prim = h;
            }
        }

        System.out.println(prim);
}
}