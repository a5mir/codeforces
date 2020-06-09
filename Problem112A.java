//https://codeforces.com/problemset/problem/112/A

import java.util.Scanner;

public class Problem112A {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        String str2  =sc.next().toLowerCase();
        
        int comp = str1.compareToIgnoreCase(str2);
        
        
         System.err.println(comp);
        if(comp > 0){
            System.out.println(1);
        } else if(comp < 0){
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
	}
}
