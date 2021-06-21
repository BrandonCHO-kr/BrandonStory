package array;

import java.util.Scanner;

public class Assignment_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;


		int[] total = new int [3];
		int[] total2 = new int [3];
		int[] total3 = new int [3];
		int[] total4 = new int [3];

		System.out.print("1class?" + " ");
		
		for (int i = 0 ; i < 3 ; i ++ ) {
			
			total[i] = input.nextInt();
			
			sum += total[i];
		}
				
		System.out.print("2class?" + " ");
				
		for (int i = 0 ; i < 3 ; i ++ ) {
					
			total[i] = input.nextInt();
					
			sum2 += total[i];

		}
		
		System.out.print("3class?" + " ");
		
		for (int i = 0 ; i < 3 ; i ++ ) {
					
			total[i] = input.nextInt();
					
			sum3 += total[i];

		}
		
		System.out.print("4class?" + " ");
		
		for (int i = 0 ; i < 3 ; i ++ ) {
					
			total[i] = input.nextInt();
					
			sum4 += total[i];

		}
		
		
		
		System.out.println("1class : " + sum);				
		System.out.println("2class : " + sum2);				
		System.out.println("3class : " + sum3);				
		System.out.println("4class : " + sum4);				

				
	}

}
