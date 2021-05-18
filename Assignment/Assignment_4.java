import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int sum,avg;
		System.out.println("첫 번째 값 :");
		int name1 = input.nextInt();
		
		System.out.println("두 번째 값 :");
		int name2 = input.nextInt();
		
		System.out.println("세 번째 값 :");
		int name3 = input.nextInt();
		
		
		sum = name1 + name2 + name3;
		avg = (name1+name2+name3)/3;
		
		System.out.println("sum = " + sum + "\n" + "avg = " + avg);
		
		

				
				
		// TODO Auto-generated method stub

	}

}
