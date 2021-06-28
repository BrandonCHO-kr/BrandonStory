package string;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.next();
		
		char[] c = new char[100];
		
		for(int i = 0 ; i < 5 ; i++) {
			if (x.length() < 5 ) {
				break;				}
			
			c[i] = x.charAt(i);
			System.out.print(c[i]);
		
		}
	}

}
