package Encapsulation;

public class User {
	
	private int pin;

	public void setPins(int pin)
	{
		this.pin=pin;
		
	}

	public void getPins() 
	{
		System.out.println("Pin is: "+pin);
		
	}
	
	public void validatePins()
	{
		if(pin == 1001  || pin == 1234 || pin== 1212)
		{
			System.out.println("User has entered a valid pin so please withdraw amount");
		}
		else
		{
			System.out.println("User has entered invalid pin so cannot withdraw amount");
		}
		}
	}


