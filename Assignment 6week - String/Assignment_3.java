package string;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        char[] arr = new char[100];			//���ڿ� ���� ����
        String str = sc.next();				//��ĳ�� 1
        int len = str.length();				//��ĳ�� 1�� ���� ���ڿ� ����
        int num = sc.nextInt();				//��ĳ�� 2
 
        for (int i = 0; i < len; i++) {		// 0���� ��ĳ�� 1�� ���� ���̱��� ���� ����
            arr[i] = str.charAt(i);			
        }
        if (num > len) {					// ��ĳ��2 ���� ��ĳ��1�� ���ڿ� �������� ũ�� ��� ����ض�
            num = len;
        }
        for (int i = len - 1; i >= len - num; i--) {	//index�� 0���� �����ϹǷ� ������ ���߱� ���� -1 �� ��
            System.out.print(arr[i]);
        }
    }
}