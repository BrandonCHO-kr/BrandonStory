package Assignment3week;

import java.util.Scanner;

public class Assignment_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int year = input.nextInt();
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) { System.out.println("leap year");}
		else {System.out.println("common year");
		
		
		}
		// TODO Auto-generated method stub

	}

}
