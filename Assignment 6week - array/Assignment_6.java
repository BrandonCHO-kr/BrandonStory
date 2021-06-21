package array;

import java.util.Scanner;

public class Assignment_6 {
//		10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 만들어라. (입력받을 정수는 1000을 넘지 않는다.)
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x ;
		
		int[] total = new int [10];
		
		for(int i = 0; i <total.length ; i ++) {
			
		x = input.nextInt();
	
		total[i] = x;
		
		}
		
		int min = total[0]; // min 0으로 초기화
		for (int i = 1; i < total.length; i++) {   // 1 < 10까지 범위설정

			if (min > total[i]) // 0 > 1 ++ 크면

				min = total[i]; // min = 1이다 

		}

		System.out.println(min);
	
	
	
	}}