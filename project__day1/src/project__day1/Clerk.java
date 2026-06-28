package project__day1;

public class Clerk extends Employee{
	private double bonus;

	public Clerk(double salary, double bonus) {
		// TODO Auto-generated constructor stub
		super(salary);
		this.bonus = bonus;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary()+bonus;
	}

}
