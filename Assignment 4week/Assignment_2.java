package Assignment4week;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {

		
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("백 이하의 정수를 입력하시오");
		
		int z = input.nextInt();
		

		while(z<=100 && (z < 101)) {
		
		sum = sum + z;

		z++;
		}
	
		System.out.println(sum);




		

	}

}
