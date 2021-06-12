package Assignment5week;

import java.util.Scanner;

public class Assignment_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		      
	        int a = input.nextInt();
	        int b = 1;
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < a; j++) {
	                System.out.print(b + " ");
	                b = (b+2 )%10;
	            }
	            System.out.println();
	        }
	    }
	}
	 

	