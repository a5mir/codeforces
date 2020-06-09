//https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

public class Problem71A {
	  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++){
                    String str = sc.next();
                    if(str.length() > 10)
                    System.out.println(Character.toString(str.charAt(0)) + (str.length()-2) + Character.toString(str.charAt(str.length()-1)));
                    else {
                        System.out.println(str);
                    }
                }
    }
}
