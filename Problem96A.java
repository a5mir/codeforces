//https://codeforces.com/problemset/problem/96/A

import java.util.Scanner;

public class Problem96A {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            String str = sc.next();
			char[] ch = str.toCharArray();
            int a = 0;
            int b = 0;
            boolean bl = false;

            for(Character cha : ch){
                if(cha.equals('0')){
                    ++a;
                } else {
                    a = 0;
                }
                if(cha.equals('1')){
                    ++b;
                } else {
                    b = 0;
                }
                if(a == 7 || b == 7){
                    System.out.println("YES");
                    bl = true  ;
                    break;
                }
            }
			if(bl == false){
    			System.out.println("NO");
			}


}
}