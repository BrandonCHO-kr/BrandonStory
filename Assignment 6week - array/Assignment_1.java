package array;

import java.util.Scanner;

public class Assignment_1 {

//	10���� ���ڸ� �Է¹޾Ƽ� ù ��° �� ��° �ϰ� ��° �Է¹��� ���ڸ� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		{"A","B","C","D","E","F","G","H","I","J"} �߿��� 1�� , 4�� 7�� ���� ���
		char[] total = new char[10];
		
		for(int i = 0; i<total.length ; i++) {
			String x = input.next();
			total[i] = x.charAt(0);			
		}
		System.out.println(total[0]+ " " + total[3] + " " + total[6]);		// array �� 0 ���� �����ϹǷ� �̷��� �ۼ�
		
	}

}
