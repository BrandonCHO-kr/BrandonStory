package array;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		
//		1�ݺ��� 6�ݱ��� ��������� ���� �� �� ���� �� ��ȣ�� �Է¹޾� �� �� ��������� ���� ����Ͻÿ�
//		�ݺ� ��������� �ʱⰪ���� 1�ݺ��� 85.6, 79.5, 83.1, 80.0, 78.2, 75.0���� �ʱ�ȭ�ϰ�, ����� �Ҽ� �ι�° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°¥������ ���.
		
		Scanner input = new Scanner(System.in);
			
		double sum = 0 ;

		double[] total = {0.0, 85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		for(int i=0; i<2; i++) {
			
		int x = input.nextInt();
			
		sum += total[x] ;
		
		}
		
		System.out.println(sum);
	}
		
	
	
}
