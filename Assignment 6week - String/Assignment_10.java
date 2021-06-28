package string;

import java.util.Scanner;

public class Assignment_10 {
// I like you better than him
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		
		String[] sp = x.split(" ");
		
		for(int i = 0 ; i < sp.length ; i++) {
			
			
			if(sp.length > 100) {
				System.out.println("다시 입력하시오");
			break;
			} if (i % 2 == 0){
				
				System.out.println(sp[i]);
			}
			
		}

	}

}
