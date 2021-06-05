package Assignment4week;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		while(true) {
		
		System.out.println("밑변의 길이를 입력하시오");
		int Base = input.nextInt();
		
		System.out.println("높이를 입력하시오");
		int Height = input.nextInt();
		
		System.out.println( ("Triangle width = " + (Base * Height ) / 2)  );
		System.out.println("Continue?");
		input.nextLine(); 
		
		
		String x = input.nextLine();
			if (!x.equals("y") && !x.equals("Y")) {
		break;

	}}

}}
