package inheritance;

import java.util.Scanner;

class Machine 
{ 
	CoinIn DM = new CoinIn();
	
	public int cupCount = 1;


	public String showData (int coin, int change) 
	{
		return "커피" + cupCount + "잔과 잔돈" + change + "원";
	}

}

 class CoinIn extends Machine 
 {
	 
	 public int coin = 0;
	 public int change = 0;
	 
	 public void culc (int cupCount)  
		{
			change = coin - cupCount * 200;
		}
	 
 }

 
public class Output 
{
		
	public static void main(String[] args) 
	{
		Machine CM = new Machine();
		
		Scanner input = new Scanner(System.in);
		
		char z ;
		
		do		
		{

			System.out.println("동전을 입력하세요 : ");
			CM.DM.coin = input.nextInt();
			
			System.out.println("몇 잔을 원하세요 : ");					
			CM.DM.cupCount = input.nextInt();
			

			if ( CM.DM.coin  < 200* CM.DM.cupCount || CM.DM.change < 0)
			{
				System.out.println("요금이 부족합니다(커피 한잔에 200원).");
			}
			
			else 
			{ 
				System.out.println("커피" + CM.DM.cupCount + "잔과 잔돈" + CM.DM.change + "원");		

			}	
			
			System.out.println("다시 입력하시겠습니까? (stop: 'n' or 'N')");	
			 z = input.next().charAt(0);
			 
		} while (z != 'n' && z != 'N') ;
	
		input.close();
			
	}
					
			
}

