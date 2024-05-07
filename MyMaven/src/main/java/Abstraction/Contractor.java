package Abstraction;

class Contractor extends Employee {
	private int workingHour;

	public Contractor(String name, int paymentperHour, int workingHour) {
		super(name, paymentperHour);
		this.workingHour=workingHour;
		// TODO Auto-generated constructor stub
	}

	public int calculateSalary() {
        return paymentperHour * workingHour;
    }
	

}
