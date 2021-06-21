package array;

import java.util.Scanner;

public class Assignment_1 {

//	10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		{"A","B","C","D","E","F","G","H","I","J"} 중에서 1번 , 4번 7번 문자 출력
		char[] total = new char[10];
		
		for(int i = 0; i<total.length ; i++) {
			String x = input.next();
			total[i] = x.charAt(0);			
		}
		System.out.println(total[0]+ " " + total[3] + " " + total[6]);		// array 는 0 부터 시작하므로 이렇게 작성
		
	}

}
