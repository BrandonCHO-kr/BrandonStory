package array;

import java.util.Scanner;

public class Assignment_6 {
//		10���� ������ �Է¹޾� �� �� ���� ���� ���� ����ϴ� ���α׷��� ������. (�Է¹��� ������ 1000�� ���� �ʴ´�.)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x ;
		
		int[] total = new int [10];
		
		for(int i = 0; i <total.length ; i ++) {
			
		x = input.nextInt();
	
		total[i] = x;
		
		}
		
		int min = total[0]; // min 0���� �ʱ�ȭ
		for (int i = 1; i < total.length; i++) {   // 1 < 10���� ��������

			if (min > total[i]) // 0 > 1 ++ ũ��

				min = total[i]; // min = 1�̴� 

		}

		System.out.println(min);
	
	
	
	}}