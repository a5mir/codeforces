//https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;

public class Problem281A {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chArray = str.toCharArray();
        chArray[0] = Character.toUpperCase(chArray[0]);
        for(char chArrays : chArray){
            System.out.print(chArrays);   
        }
        System.out.println("");
	}
}
