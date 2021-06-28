package string;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String total = "Hong Gil Dong";
		
		String[] change = total.split("");
		
		for(int i=3; i<=6; i++) {
			System.out.print(change[i]);
		}

	}

}
