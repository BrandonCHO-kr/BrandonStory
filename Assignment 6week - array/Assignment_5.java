package array;

import java.util.Scanner;

public class Assignment_5 {
// 100개의 정수를 저장할 수 있는 배열 선언 후, 입력받다가 0이 되면 0을 제외한 나머지 정수를 꺼꾸로 출력해라
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		
		int[] total = new int [100];
				
		for(int i = 0; i <100 ; i ++) {
			total[i] = input.nextInt();

		if(total[i] == 0) {
			for (int j = 1 ; j <= i ; j ++) {
				System.out.println(total[i-j]+" "); // i - j  뒤에서부터 출력
			}
				
			break;
			
		}
			
					
		}
		System.out.println();	

	}

}
