package string;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
    String str = sc.next();	// ���� ��ĳ��
    int len = str.length();	// ���ڿ� ����
    int count;				// ī��Ʈ ���� ����
    
    char[] c = new char[100];		//���ڿ� 100�� ����

    
    for (int i = 0; i < len; i++) {		// ���� ����
        c[i] = str.charAt(i);			// ���ڿ��� �� ���ڷ� ������ �� �ְ� ���
    }

    for (int i = 0; i < len; i++) {		
        count = len - 1 - i;			// INDEX�� 0���� �����ϱ� ������ ù ���� 7��° ���� ���߱� ���� - 1 �� �� (�ε����� 6) 
        
        for (int j = 0; j < len; j++) {
            if (count == len) {
                count = 0;
            }
            System.out.print(c[count]);
            count++;
        }
        System.out.println();
    }
}
}