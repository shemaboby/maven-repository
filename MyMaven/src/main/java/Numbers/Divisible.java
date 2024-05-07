package Numbers;

public class Divisible extends AdditionResult {

	private void divideby()
	{
		int result=super.sum();
		
		if(result %10==0)
		{
			System.out.println("Addition result is divisible by 10");
		}
		else
		{
			System.out.println("Addition result is non divisible by 10");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible dobj= new Divisible();
		dobj.divideby();
		
	}

}
