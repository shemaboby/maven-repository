package Exceptions;

public class LicenseSample {
	
	public static void checkAge(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("Not Eligible");
		}
		else
		{
			System.out.println("License Approved");
		}
	}
	
	public static void main(String[] args) throws LicenseException
	{
		checkAge(10);
	}

}
