package string;

import java.util.Scanner;

public class Assignment_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] x = new String[5]; // �Է� 5��
		
		for(int i = 0 ; i < 5 ; i++){
		
			x[i] = input.nextLine();
		}
		for(int i = 4 ; i >= 0 ; i--){
			
			System.out.println(x[i]);
	
		int len = x[i].length();
		if (len > 30) {
			
			System.out.println("�ٽ� �Է� �Ͻÿ�");
			break;
		}

	}
        
        
        

	}

}
