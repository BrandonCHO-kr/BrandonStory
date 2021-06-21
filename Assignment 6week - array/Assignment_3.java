package array;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		
//		1반부터 6반까지 평균점수를 저장 후 두 반의 반 번호를 입력받아 두 반 평균점수의 합을 출력하시오
//		반별 평균점수는 초기값으로 1반부터 85.6, 79.5, 83.1, 80.0, 78.2, 75.0으로 초기화하고, 출력은 소수 두번째 자리에서 반올림하여 소수 첫째짜리까지 출력.
		
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
