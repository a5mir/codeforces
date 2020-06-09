//https://codeforces.com/problemset/problem/263/A

import java.util.Scanner;

public class Problem263A {
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        int row = 0;
        int col = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
       
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(matrix[i][j] == 1){
                    row = j+1;
                    col = i+1;
                }
            }
        }
      
        System.out.println(Math.abs((row - 3)) + Math.abs((col - 3)));
	}
}
