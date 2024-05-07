package Exceptions;

import java.io.IOException;

public class ThrowsExample {

	public static void MyException() throws IOException
	{
		throw new IOException("IOException occured");
	}
	public static void MyException1() throws ArithmeticException
	{
		throw new ArithmeticException("ArithmeticException occured");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			MyException1();
			MyException();
			
		}
		catch(IOException e)
		{
			System.out.println("My IOException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("My ArithmeticException");
		}
		System.out.println("Rest of code");
	}

}
