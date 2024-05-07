package Abstraction;

public abstract class Employee {
	protected String name;
	protected int paymentperHour;
	
	public Employee(String name, int paymentperHour) {
		this.name=name;
		this.paymentperHour=paymentperHour;
	}

	public abstract int calculateSalary();
}
