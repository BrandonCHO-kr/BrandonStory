package string;

import java.util.Scanner;

public class Assignment_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("단어 10개를 입력하시오");
		String [] x = new String[10]; 

		for(int i = 0 ; i < 10 ; i ++) {
			
			x[i] = input.nextLine();
			int len = x[i].length(); // 추가

		if(len > 20 ) {
			System.out.println("다시 입력 하시오");
			break;
		}
		}
		System.out.println("한개의 문자를 입력하시오");
		String y = input.next();
		int len = y.length(); // 추가
		
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
