package string;

import java.util.Scanner;

public class Assignment_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   
	        String s = sc.nextLine();
	        int len = s.length();
	        char[] c = new char[100];
	 
	        for (int i = 0; i < len; i++) {
	            c[i] = s.charAt(i);
	            if (c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z' || c[i] >= '0' && c[i] <= '9') {
	                if (c[i] >= 'A' && c[i] <= 'Z') {
	                    System.out.print(String.valueOf(c[i]).toLowerCase());  // valueOf() �޼ҵ�� ()��ȣ ���� �ش� ��ü�� String ��ü�� ��ȯ��Ű�� ����
	                } else {
	                    System.out.print(c[i]);
	                }
	            }
	        }
	    }
	}