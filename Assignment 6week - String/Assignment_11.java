package string;

import java.util.Scanner;

public class Assignment_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�ܾ� 10���� �Է��Ͻÿ�");
		String [] x = new String[10]; 

		for(int i = 0 ; i < 10 ; i ++) {
			
			x[i] = input.nextLine();
			int len = x[i].length(); // �߰�

		if(len > 20 ) {
			System.out.println("�ٽ� �Է� �Ͻÿ�");
			break;
		}
		}
		System.out.println("�Ѱ��� ���ڸ� �Է��Ͻÿ�");
		String y = input.next();
		int len = y.length(); // �߰�
		
		if (len == 1) {
			
		for(int i = 0 ; i < 10 ; i ++) {

		if(x[i].endsWith(y)) {
			System.out.println(x[i]);
	}
	}	
	}
		
}}

//champion
//tel
//pencil
//olympiad
//class
//information
//jungol
//lesson
//book
//lion
//l
