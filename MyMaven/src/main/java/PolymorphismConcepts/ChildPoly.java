package PolymorphismConcepts;

public class ChildPoly extends ParentPoly {

	public void printSum(int c, int d)
	{
		super.printSum(30,50);
		int sum= c+d;
		System.out.println("Sum of 2 numbers in child class is:"+sum);
	}
	public void display() {
		//super.show();
		System.out.println("This is my child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildPoly cp=new ChildPoly();
		cp.printSum(10, 30);
		ParentPoly p= new ChildPoly();//up casting
		p.show();
		cp.display();
		
	}

}
