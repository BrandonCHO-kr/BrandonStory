package array;

import java.util.Scanner;

public class Assignment_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int result = 0 ;

		int[][] total = new int [4][2];			// 4 �� 2�� �Է�
		
		
		for (int i = 0 ; i < 4 ; i ++) {			// Ʋ ���
			for (int j = 0 ; j < 2 ; j ++) {
				
				total[i][j] = input.nextInt();		// �Է� 
			}
		}
		
		
		for (int i = 0 ; i < 4 ; i ++) {			// Ʋ���

			int sum = 0;

			for (int j = 0 ; j < 2 ; j ++) {

				sum += total[i][j];					// ���� ��հ� 

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

			System.out.print((sum / 4) + " ");		// ���� ��հ� 

		}

		System.out.println();

		System.out.println(result / 8);				// ��ü ��հ� 

	}



	}

