package Assignment5week;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt=0;
		int sum=0;
		for(int i=1;sum<n;i++) {
			if(i%2==1) {
				sum+=i;
				cnt++;
			}
		}
	System.out.printf("%d %d", cnt,sum);
}
}
