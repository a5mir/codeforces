//https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

public class Problem59A {
	 public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
            String st = sc.next();
            char[] ch = st.toCharArray();
            int low = 0;
            int upp = 0;

        for (char cc : ch) {
                if(cc >= 65 && cc<=90){
                    upp++;
                }
        }

        low = ch.length - upp;

        if(upp>low){
            System.out.println( st.toUpperCase());
        } else{
            System.out.println( st.toLowerCase());
        }
}
}