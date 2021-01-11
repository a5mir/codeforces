//https://codeforces.com/problemset/problem/69/A

import java.util.Scanner;

public class Problem69A {
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] li = {0, 0, 0};
            
        for (int j = 0; j < n; j++) {
            li[0] += sc.nextInt();
            li[1] += sc.nextInt();
            li[2] += sc.nextInt();
        }

        if(li[0] == 0 && li[1] == 0 && li[2] == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


}
}