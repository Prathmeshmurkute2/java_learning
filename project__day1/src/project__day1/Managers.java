package project__day1;

public class Managers extends Employee{
	private double commission;
	
	public Managers(double salary, double commission) {
		super(salary);
		this.commission = commission;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary()+commission;
	}
}
