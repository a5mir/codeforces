//https://codeforces.com/problemset/problem/791/A

import java.util.Scanner;

public class Problem791A {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int y = 0;

            do {
                a *= 3;
                b *= 2;
                y++;
            }while (a<=b);

        System.out.println(y);
}
}