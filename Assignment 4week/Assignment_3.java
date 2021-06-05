package Assignment4week;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		
		int x = 1;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("자연수 하나를 입력하시오");
		
		int i = input.nextInt();
		
		
		
		
		while( x < 11) {
			System.out.print(x * i + " ");
			
			x++;
		}

	}

}
