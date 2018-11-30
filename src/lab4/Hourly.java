package lab4;

public class Hourly extends Employee {

	private double hourlyWage;
	private double hoursPerWeek;
	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return hourlyWage*hoursPerWeek*4;
	}

}
