package Assignment5week;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        
        for (int i = 1; a*i <= 100; i++) {
            System.out.print(a*i + " ");
 
            if ((a*i)%10 ==0) {
                break;
            }
        }
    }
}
 