package Assignment5week;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		
		for(int x = 1; x<=i; x++) {
			for(int y = 1 ; y<=x;  y++) 
				
				System.out.print("*");
				System.out.println("");
		}

	}

}

