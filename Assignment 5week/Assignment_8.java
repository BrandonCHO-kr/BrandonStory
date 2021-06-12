package Assignment5week;

import java.util.Scanner;

public class Assignment_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = 1;
 
 
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= a-i-1; j++) {
                System.out.print(b++ + " ");
            }
            System.out.println();
        }
 
    }
}
 

	