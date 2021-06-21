package array;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
//		10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오. 
//		평균은 반올림하여 소수첫째자리까지 출력
				
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