package Assignment4week;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		while(true) {
		
		System.out.println("�غ��� ���̸� �Է��Ͻÿ�");
		int Base = input.nextInt();
		
		System.out.println("���̸� �Է��Ͻÿ�");
		int Height = input.nextInt();
		
		System.out.println( ("Triangle width = " + (Base * Height ) / 2)  );
		System.out.println("Continue?");
		input.nextLine(); 
		
		
		String x = input.nextLine();
			if (!x.equals("y") && !x.equals("Y")) {
		break;

	}}

}}
