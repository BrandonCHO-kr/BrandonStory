package Assignment4week;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			int i = input.nextInt();
			if(i==0)
				break;
			if(i%3 !=0 &&i%5 !=0)
				sum++;
		
		}
		System.out.println(sum);

	}

}
