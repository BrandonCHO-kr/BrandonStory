package Assignment3week;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		

		
		if(a>b && a>c) {System.out.print(1);
		} else{System.out.print(0);};
		
		
		if(a==b && a==c && b==c) {System.out.print(" " + 1);}
		else {System.out.print(" " + 0);}
		
		
		
		


		
		

	}

}
