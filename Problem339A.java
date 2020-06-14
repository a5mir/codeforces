//https://codeforces.com/problemset/problem/339/A

import java.util.Scanner;
import java.util.Arrays;

public class Problem339A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("\\+");
        int[] array  = new int[arr.length];
        String output = "";
        for(int i = 0; i < arr.length; i++){
            array[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(array);
        for(int arrays : array){
            output += arrays + "+";
        }
        
        System.out.println(output.substring(0, output.length()-1));
	}
}
