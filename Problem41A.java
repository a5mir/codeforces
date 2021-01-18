//https://codeforces.com/problemset/problem/41/A

import java.util.Scanner;

public class Problem41A {
	 public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String t = sc.next();
            char[] ch = s.toCharArray();
            char[] th = t.toCharArray();
            int c=0;

        if(ch.length==th.length) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == th[th.length - 1 - i]) {
                    c++;
                }
            }
            if (c == ch.length) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
}
}