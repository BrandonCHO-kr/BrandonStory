package array;

import java.util.Scanner;

public class Assignment_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int[][] total = new int [2][4];
		int[][] total2 = new int [2][4];
		int[][] total3 = new int [2][4];

		System.out.println("first array");
		
		
		for(int i = 0 ; i < 2 ; i ++) {    			// 2 : 4 �迭
			for(int j = 0 ; j < 4 ; j ++ ) {
				
				total[i][j] = input.nextInt();		// ��� �����ϰ� ��ĳ��
				
			}
			
		}
		
		System.out.println("second array");			

		for(int i = 0 ; i < 2 ; i ++) {				// 2 : 4 �迭
			for(int j = 0 ; j < 4 ; j ++ ) {
				
				total2[i][j] = input.nextInt();		// ��� �����ϰ� ��ĳ��
			}
			
		}
		
		
		for (int i = 0; i < 2; i++) {				// 2 : 4 �迭

			for (int j = 0; j < 4; j++) {

				total3[i][j] = total[i][j] * total2[i][j];		// first * second array

				System.out.print(total3[i][j] + " ");			// ��� �����ϰ� ��ĳ��

			}

			System.out.println();

	}
	}
}
