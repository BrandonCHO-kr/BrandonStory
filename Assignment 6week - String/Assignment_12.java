package string;

import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	        String n1 = sc.next();
	        String n2 = sc.next();
	 
	        n2 = n1.substring(0,2) + n2.substring(2);//앞문자열 0,1까지 문자 추출하고 뒷 문자열2부터 다시 이어서 시작하기떄문에
	        n2 += n1.substring(0,2);//앞에 빠진 0,1두 문자 뒤에 이어 붙이기 위해 존재
	 
	        System.out.println(n2);
	    }
	}
