package Assignment3week;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		int a = x++;
		
		int b = --y;
		
		System.out.println(x);
		System.out.println(b);
		System.out.println(a*b);


		// TODO Auto-generated method stub

	}

}
