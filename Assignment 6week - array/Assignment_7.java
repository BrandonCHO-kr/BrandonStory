package array;

import java.util.Scanner;

public class Assignment_7 {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   
	        int[] arr = new int[10];
	        
	        int num;
	        
	        for (int i = 0; i < 10; i++) {
	        	
	            arr[i] = 0;
	        }
	        
	        while (true) {
	            num = sc.nextInt();
	            
	            if (num == 0) {
	                break;
	                
	            }
	            
	            arr[(int) (Math.floor(num / 10.0))]++;
	        }
	        for (int i = 0; i < 10; i++) {
	            if (arr[i] != 0) {
	                System.out.print(i + " : ");
	                System.out.println(arr[i]);
	            }
	        }
	    }
	}
