package lab4;

import java.util.ArrayList;
import java.util.Date;

public abstract class Employee {

	int empid;
	private Date compensateMonth;
	public void print() {
		
	}
	
	public Paycheck calcCompensation(Date month) {
			  
		this.compensateMonth=month;
		return new Paycheck(this.calcGrossPay(),0.23,0.05,0.01,0.03,0.075);
	}
	
	protected Date getCompensateMonth() {
		return this.compensateMonth;
	}
	
	protected abstract double calcGrossPay();
}
