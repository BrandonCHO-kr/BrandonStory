package inheritance;

abstract class Employee 
{
	
	String irum ; //�̸�
	int nai ; //����
	
	Employee () 
	{
		irum = "";
		nai = 1;
	}
	
	abstract int pay(); 
	abstract String dataPrint();
	
	Employee (String irum, int nai) 
	{
		this.irum = irum;
		this.nai = nai;
	}
	
	String irumnai_Print(String irum, int nai) 
	{
		return "�̸� : " + irum + ", ���� : " + nai;
	
	}
}

 class Temporary extends Employee

{	

	int ilsu ; //�ϼ�
	int ildang ; //�ϴ�
	
	Temporary(String irum, int nai, int ilsu, int ildang) 
	{
		this.irum = irum;
		this.nai = nai;
		this.ilsu = ilsu;
		this.ildang = ildang;
	}

	@Override
	int pay() 
	{
		return ilsu * ildang ;
	}

	@Override
	String dataPrint() 
	{
		return irumnai_Print(irum, nai) + ", ���� : " + pay();
	}

}

 class Regular extends Employee
{
		int salary ; //����
		
		Regular () //����Ʈ������
		{
			irum = "";
			nai = 1;
			salary = 0;
		}
		
		Regular(String irum, int nai, int salary)
		{
			this.irum = irum;
			this.nai = nai;
			this.salary = salary;
		}
		
		@Override
		int pay() {
			return salary;
		}
		
		@Override
		String dataPrint() 
		{
			return irumnai_Print(irum, nai) + ", �޿� : " + pay();			
		}

}

 class Salesman extends Regular
 {
	 int sales ; //����
	 double commission ; //��������(��:0.25)

	 
	 
	 Salesman (String irum, int nai, int salary, int sales, double commission)
	 	{
	 		this.irum = irum;
	 		this.nai = nai;
	 		this.salary = salary;
	 		this.sales = sales;
	 		this.commission = commission;
 		}
	 
	 @Override
	 int pay()  //���ɾ� �޿� + �������� (����*��������)
	 	{ 
		 return (int)(salary + sales * commission);
		}
		
	 @Override
	 String dataPrint() 
		{
			return irumnai_Print(irum, nai) + ", ���ɾ� : " + pay();
		}
	 
	 
 }

 public class EmpTest
 {
		public static void main(String[] args) 
		{
			  Temporary t = new Temporary ("ȫ�浿", 25, 20, 15000);
			  Regular r = new Regular ("�ѱ���", 27, 3500000);
			  Salesman s = new Salesman ("�տ���", 29, 1200000, 5000000, 0.25);
			  
			  System.out.println(t.dataPrint() + "\n" + r.dataPrint() + "\n" + s.dataPrint() );

		}

	 
 }

