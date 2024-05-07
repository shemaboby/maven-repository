package Encapsulation;

public class Employee {
	private long AcNumber;
	private String emailid,name;
	
public void setter(long AcNumber, String name, String emailid)
{
	this.AcNumber=AcNumber;
	this.name=name;
	this.emailid=emailid;
}

public void getter()
{
	System.out.println("Account Number is: "+AcNumber);
	System.out.println("Name is: "+name);
	System.out.println("Email is: "+emailid);
}
}
