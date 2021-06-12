package Assignment5week;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		int j = input.nextInt();
		
		
		
		for(int x = 1; x<=i; x++) {
			for(int y =1; y<=j; y++) 
				
				System.out.print(x * y + " ");	
			
			System.out.println("");

		}		

	}
	

	
	
}
