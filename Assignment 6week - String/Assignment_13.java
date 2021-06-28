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
				System.out.println("다시 입력하시오");
			break;				} 
											}
		
		for(int i = sp.length -1  ; i >= 0 ; i--) {		// 위의 반복문과 다르게 해줘야 하므로 -1 / >= 0 으로 변경
			
			System.out.println(sp[i]);
		}
		
		
	}}
