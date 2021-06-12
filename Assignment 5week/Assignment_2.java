package Assignment5week;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {

				
		System.out.println("숫자를 입력하시오");

		int x = input.nextInt();
		int y = input.nextInt();


		if(x>y) {
			for(int j = 1; j <=9 ; j++) {
				for(int i = x; i >= y; i--) {
					System.out.printf("%d * %d = %2d   " ,i,j,i*j);
											}
			System.out.println();
			
										}
				}
		else { 
			for(int j = 1; j <=9 ; j++) {
				for(int i = x ; i <=y; i++)
					System.out.printf("%d * %d = %2d   " ,i,j,i*j);
										}
					System.out.println();

			}
		}
}
