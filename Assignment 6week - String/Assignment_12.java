package string;

import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	        String n1 = sc.next();
	        String n2 = sc.next();
	 
	        n2 = n1.substring(0,2) + n2.substring(2);//�չ��ڿ� 0,1���� ���� �����ϰ� �� ���ڿ�2���� �ٽ� �̾ �����ϱ⋚����
	        n2 += n1.substring(0,2);//�տ� ���� 0,1�� ���� �ڿ� �̾� ���̱� ���� ����
	 
	        System.out.println(n2);
	    }
	}
