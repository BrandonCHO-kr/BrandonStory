package array;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오. 출력은 반올림하여 소수 첫째짜리까지로 한다.
		
//		double[] total = {23.2, 39.6, 66.4, 50.0, 45.6, 48.0};
		double[] total = new double [6];

		double sum = 0 ;
		double average = 0 ; 
		
		for(int i = 0 ; i < 6 ; i ++){
		
		total[i] = input.nextDouble();
		
		sum= sum + total[i];
		
		}
		average = sum / 6;
		
		System.out.printf("%.1f", average);		// 소수점 첫째짜리
		

	}

}
