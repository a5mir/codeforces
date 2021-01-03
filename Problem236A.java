//https://codeforces.com/problemset/problem/236/A

import java.util.Scanner;

public class Problem236A {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            String str = sc.next();

            int num = (int) str.chars().distinct().count();
            if(num%2 == 0){
                System.out.println("CHAT WITH HER!");
            } else {
                System.out.println("IGNORE HIM!");
            }
}
}