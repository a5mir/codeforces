//https://codeforces.com/problemset/problem/617/A

import java.util.Scanner;

public class Problem617A {
	 public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int res = 1;

            if(x>5){
                res = x/5;
                if(x%5 != 0)
                res++;
            }

        System.out.println(res);
}
}