package AccessModifiersConcepts;

public class AccessModifiers {

	protected int num1=10;
	 protected int num2=20;
	
	protected void sum()
	{
		int sum=num1+num2;
		System.out.println("Sum of 2 numbers is:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers am= new AccessModifiers();
		am.sum();
	}

}
