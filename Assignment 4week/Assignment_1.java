package Assignment4week;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {

		int sum = 0;
		int y = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� ������ ������ �Է��Ͻÿ�");
		
		int z = input.nextInt();
		

		while(y<=z && (z < 101)) {
		
		sum = sum + y;

		y++;
		}
	
		System.out.println(sum);

	}

}
