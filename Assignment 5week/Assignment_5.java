package Assignment5week;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (a-i)*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

