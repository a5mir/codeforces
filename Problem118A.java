//https://codeforces.com/problemset/problem/118/A

import java.util.Scanner;

public class Problem118A {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
            String string = sc.nextLine().toLowerCase();
            char[] chr = string.toCharArray();
            String fs = "";

            for(Character c : chr) {
                if (c.equals('a') || c.equals('o') || c.equals('y') || c.equals('e') || c.equals('u') || c.equals('i')) {
                } else {
                    fs += "."+c;
                }
            }
        System.out.println(fs);
}
}