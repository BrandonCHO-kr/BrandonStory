package array;

import java.util.Scanner;

public class Assignment_5 {
// 100���� ������ ������ �� �ִ� �迭 ���� ��, �Է¹޴ٰ� 0�� �Ǹ� 0�� ������ ������ ������ ���ٷ� ����ض�
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		
		int[] total = new int [100];
				
		for(int i = 0; i <100 ; i ++) {
			total[i] = input.nextInt();

		if(total[i] == 0) {
			for (int j = 1 ; j <= i ; j ++) {
				System.out.println(total[i-j]+" "); // i - j  �ڿ������� ���
			}
				
			break;
			
		}
			
					
		}
		System.out.println();	

	}

}
