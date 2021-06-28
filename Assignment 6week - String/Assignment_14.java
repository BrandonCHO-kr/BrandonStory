package string;

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.next();
		String y = input.next();
		int z = input.nextInt();
		
		
		System.out.println(x.concat(y));
		
		 y = x.substring(0,z) + y.substring(z);

        System.out.println(y);



		
	}

}
