package Assignment3week;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println(x + " > " + y + "--- " + (x>y ? 1 : 0));
		System.out.println(x + " < " + y + "--- " + (x<y ? 1 : 0));
		System.out.println(x + " >= " + y + "--- " + (x>=y ? 1 : 0));
		System.out.println(x + " <= " + y + "--- " + (x<=y ? 1 : 0));


				

	}

}
