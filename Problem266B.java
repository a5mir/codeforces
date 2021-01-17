//https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class Problem266B {
	 public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int t = sc.nextInt();
            String st = sc.next();
            char[] ch = st.toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n-1; j++) {
                if(ch[j] == 'B' && ch[j+1] == 'G'){
                    ch[j] = 'G';
                    ch[j+1] = 'B';
                    j++;
                }
            }
        }
        for(char cc : ch){
            System.out.print(cc);
        }
}
}