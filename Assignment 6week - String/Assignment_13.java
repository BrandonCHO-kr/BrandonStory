package string;

import java.util.Scanner;

public class Assignment_13 {
	
// c++ Programing jjang!!
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		
		String[] sp = x.split(" ");
		
		for(int i = 0 ; i < sp.length ; i++) {
			
			
			if(sp.length > 100) {
				System.out.println("�ٽ� �Է��Ͻÿ�");
			break;				} 
											}
		
		for(int i = sp.length -1  ; i >= 0 ; i--) {		// ���� �ݺ����� �ٸ��� ����� �ϹǷ� -1 / >= 0 ���� ����
			
			System.out.println(sp[i]);
		}
		
		
	}}
