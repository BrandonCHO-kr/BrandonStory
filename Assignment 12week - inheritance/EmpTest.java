package inheritance;

abstract class Employee 
{
	
	String irum ; //이름
	int nai ; //나이
	
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
		return "이름 : " + irum + ", 나이 : " + nai;
	
	}
}

 class Temporary extends Employee

{	

	int ilsu ; //일수
	int ildang ; //일당
	
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
		return irumnai_Print(irum, nai) + ", 월급 : " + pay();
	}

}

 class Regular extends Employee
{
		int salary ; //월급
		
		Regular () //디폴트생성자
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
			return irumnai_Print(irum, nai) + ", 급여 : " + pay();			
		}

}

 class Salesman extends Regular
 {
	 int sales ; //실적
	 double commission ; //수수료율(예:0.25)

	 
	 
	 Salesman (String irum, int nai, int salary, int sales, double commission)
	 	{
	 		this.irum = irum;
	 		this.nai = nai;
	 		this.salary = salary;
	 		this.sales = sales;
	 		this.commission = commission;
 		}
	 
	 @Override
	 int pay()  //수령액 급여 + 영업수당 (실적*수수료율)
	 	{ 
		 return (int)(salary + sales * commission);
		}
		
	 @Override
	 String dataPrint() 
		{
			return irumnai_Print(irum, nai) + ", 수령액 : " + pay();
		}
	 
	 
 }

 public class EmpTest
 {
		public static void main(String[] args) 
		{
			  Temporary t = new Temporary ("홍길동", 25, 20, 15000);
			  Regular r = new Regular ("한국인", 27, 3500000);
			  Salesman s = new Salesman ("손오공", 29, 1200000, 5000000, 0.25);
			  
			  System.out.println(t.dataPrint() + "\n" + r.dataPrint() + "\n" + s.dataPrint() );

		}

	 
 }

