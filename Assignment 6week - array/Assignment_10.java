package array;

import java.util.Scanner;

public class Assignment_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int result = 0 ;

		int[][] total = new int [4][2];			// 4 행 2열 입력
		
		
		for (int i = 0 ; i < 4 ; i ++) {			// 틀 잡기
			for (int j = 0 ; j < 2 ; j ++) {
				
				total[i][j] = input.nextInt();		// 입력 
			}
		}
		
		
		for (int i = 0 ; i < 4 ; i ++) {			// 틀잡기

			int sum = 0;

			for (int j = 0 ; j < 2 ; j ++) {

				sum += total[i][j];					// 가로 평균값 

			}

			result += sum;

			System.out.print((sum / 2) + " ");

		}

		System.out.println();
		for (int i = 0; i < 2; i++) {

			int sum = 0;

			for (int j = 0; j < 4; j++) {

				sum += total[j][i];

			}

			System.out.print((sum / 4) + " ");		// 세로 평균값 

		}

		System.out.println();

		System.out.println(result / 8);				// 전체 평균값 

	}



	}

