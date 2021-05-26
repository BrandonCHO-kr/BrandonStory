package Assignment3week;

import java.util.Scanner;

public class Assignment_9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String sex = input.nextLine();
		int age = input.nextInt();
		
		

		if(sex.equals ("M") && age > 19) {System.out.println("MAN");}
		else if(sex.equals ("M") && age <= 19) {System.out.println("BOY");}
		else if(sex.equals ("F") && age > 19) {System.out.println("WOMAN");}
		else if(sex.equals ("F") && age <= 19) {System.out.println("GIRL");}
		else {System.out.println("error");
		
		
		}

		// TODO Auto-generated method stub

	}

}
