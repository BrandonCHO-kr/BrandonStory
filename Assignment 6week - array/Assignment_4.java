package array;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
//		10���� ������ �Է¹޾� �迭�� ������ �� ¦�� ��° �Էµ� ���� �հ� Ȧ�� ��° �Էµ� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//		����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ���
				
		Scanner input = new Scanner(System.in);

//		int[] total = {95 100 88 65 76 89 58 93 77 99};
		int[] arr = new int[10];

		int sum1 = 0;

		double sum2 = 0;

		for (int i = 0; i < arr.length; i++) {

			arr[i] = input.nextInt();

			if (i % 2 == 0)

				sum2 += arr[i];

			else

				sum1 += arr[i];

		}
		System.out.println("sum : "+sum1);

		System.out.printf("avg : %.1f",sum2/5);

	}

}