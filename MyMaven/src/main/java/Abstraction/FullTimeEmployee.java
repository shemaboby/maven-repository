package Abstraction;

public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(String name, int paymentperHour)
	{
		super(name,paymentperHour);
	}

	public int calculateSalary()
	{
		return paymentperHour * 8;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor c= new Contractor("Shema",30,8);
		FullTimeEmployee f= new FullTimeEmployee("Tina",100);
		System.out.println("Contractor Salary: " +c.calculateSalary()); 
        System.out.println("Full-Time Employee Salary: " +f.calculateSalary());
	}

}
