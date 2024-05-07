package SuperConcepts;

public class Bank {

	String name="RBI";
	float interest=7.5f;
	public Bank()
	{
		System.out.println("Parent class constructor");
	}
	public Bank(String name, float interest)
	{
	this.name=name;
	this.interest=interest;
	}
	public void printInterestRate()
	{
		System.out.println("Interest rates for Bank is: "+interest);
	}
}
