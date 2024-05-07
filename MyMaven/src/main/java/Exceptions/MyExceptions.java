package Exceptions;

public class MyExceptions {
	 public static void checkMax()
	 {
		 int a=90;
		 int b=40;
		 if(a>b)
		 {
			 throw new ArithmeticException("a is greater than b");
		 }
		 else
		 {
			 System.out.println("a not greater than b");
		 }
	 }
	 
	
	public static void main(String[] args) {
		 int a=3;
		 int b=6;
		 int s= a+b;
		 checkMax();
		 try
		 {
			 checkMax();
			 int arr[]= new int[5];
			 arr[20]=90;
			 int result= 30/0;
			 
			
		 }
		 catch(ArithmeticException e) {
			 System.out.println(e);
		 }
		 /*catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Parent Exception");
		 }*/
		
	
		 
		 finally {
			 System.out.println("This is my finally block");
		 }
		 
		 System.out.println("Code after try catch");
	}

}
