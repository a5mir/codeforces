//https://codeforces.com/problemset/problem/1/A

import java.util.Scanner;

public class Problem1A {
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
            long n = sc.nextInt();
            long m = sc.nextInt();
            long a = sc.nextInt();

            long num1 =  n / a;
            long num2 =  m / a;

        if(n%a > 0){
            ++num1;
        }
        if(m%a > 0){
            ++num2;
        }
        System.out.println(num1*num2);
}
}