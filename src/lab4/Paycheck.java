package lab4;

public class Paycheck {

	double grossPay;
	double fica;
	double state;
	double local;
	double medicalcare;
	double socialsecurity;
	
	public Paycheck(double grossPay,double fica,double state,double local,double medicalcare,double socialsecurity){
		this.grossPay=grossPay;
		this.fica=fica;
		this.state=state;
		this.local=local;
		this.medicalcare=medicalcare;
		this.socialsecurity=socialsecurity;
	}
	
	public void print() {
		
	}
	
	public double getNetPay() {
		return grossPay-getDeductionAmount();
	}
	
	private double getDeductionAmount() {
		return (grossPay*(fica+state)+local+medicalcare+socialsecurity);
	}
	
}
