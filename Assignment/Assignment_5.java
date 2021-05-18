import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double YARD1 = 91.44;
		
		System.out.print("yard?");
		double yard = input.nextDouble();

		
		double result = yard * YARD1;
		
		
		System.out.println(yard + "yard = " + (String.format("%.1f",result)) + "cm");
		
		
				
		// TODO Auto-generated method stub

	}

}
