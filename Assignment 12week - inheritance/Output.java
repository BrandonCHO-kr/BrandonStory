package inheritance;

import java.util.Scanner;

class Machine 
{ 
	CoinIn DM = new CoinIn();
	
	public int cupCount = 1;


	public String showData (int coin, int change) 
	{
		return "Ŀ��" + cupCount + "�ܰ� �ܵ�" + change + "��";
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

			System.out.println("������ �Է��ϼ��� : ");
			CM.DM.coin = input.nextInt();
			
			System.out.println("�� ���� ���ϼ��� : ");					
			CM.DM.cupCount = input.nextInt();
			

			if ( CM.DM.coin  < 200* CM.DM.cupCount || CM.DM.change < 0)
			{
				System.out.println("����� �����մϴ�(Ŀ�� ���ܿ� 200��).");
			}
			
			else 
			{ 
				System.out.println("Ŀ��" + CM.DM.cupCount + "�ܰ� �ܵ�" + CM.DM.change + "��");		

			}	
			
			System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�? (stop: 'n' or 'N')");	
			 z = input.next().charAt(0);
			 
		} while (z != 'n' && z != 'N') ;
	
		input.close();
			
	}
					
			
}

