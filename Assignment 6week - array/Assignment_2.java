package array;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		6���� �����Ը� �Է¹޾� �������� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ����� �ݿø��Ͽ� �Ҽ� ù°¥�������� �Ѵ�.
		
//		double[] total = {23.2, 39.6, 66.4, 50.0, 45.6, 48.0};
		double[] total = new double [6];

		double sum = 0 ;
		double average = 0 ; 
		
		for(int i = 0 ; i < 6 ; i ++){
		
		total[i] = input.nextDouble();
		
		sum= sum + total[i];
		
		}
		average = sum / 6;
		
		System.out.printf("%.1f", average);		// �Ҽ��� ù°¥��
		

	}

}
