//https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

public class Problem266A {
	 public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String string = sc.next();
            char[] chr = string.toCharArray();
            int res = 0;

        for (int i = 0; i < chr.length-1; i++) {
            if(chr[i] == chr[i+1]){
                ++res;
            }
        }
        System.out.println(res);
}
}