package string;

import java.util.Scanner;

public class Assignment_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.next();
		String y = input.next();
		
		if ( x.length() > 100 || y.length() > 100 ) {
			System.out.println("다시 입력하라");
		}
        else if(x.length() > y.length()) {
        	System.out.println(x.length());
        } else System.out.println(y.length());

	}

}
