package string;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		String total = input.next();
		String total2 = input.next();	
		int x = total.length();
		int y = total.length();
		
		
		if (x >= 20 || y >= 20) {	
			
			System.out.println("�ٽ� �Է� �Ͻÿ�");
								}
		
		else {
		System.out.println(total.length() + total2.length());
		}
	}

}
