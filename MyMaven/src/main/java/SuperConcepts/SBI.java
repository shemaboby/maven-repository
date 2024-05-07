package SuperConcepts;

public class SBI extends Bank {
	
	String name="SBI";
	int interestRate=8;

	public SBI()
	{
		System.out.println("Bank name is:"+super.name);
		System.out.println("Child bank name is:"+name);
	System.out.println("Child class constructor");
	}
	public SBI(String name, float interest)
	{
	super("RBI",7.5f);
	System.out.println("Child parametrized constructor");
	}
	public void printInterestRate()
	{
		super.printInterestRate();
		System.out.println("Interest rates for Bank is: "+interestRate);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi= new SBI();
		sbi.printInterestRate();
		SBI sbi1= new SBI("RBI",7.5f);
		
				
	}

}
