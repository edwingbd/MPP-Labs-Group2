package lab4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Commissioned extends Employee {

	double commission;
	double basesalary;
	
	ArrayList<Order> orders;
		
	Commissioned(){
		orders=new ArrayList<Order>();
	}
	
	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return getCommissionAmount()+basesalary;
	}
	
	private double getCommissionAmount() {
	 
		int totalorderAmount=0;
		for(Order ord: orders) {
			
			if(ord.orderDate.compareTo(deductMonthFromDate())==0) {
				totalorderAmount+=ord.getOrderAmount();
			}
		}
		
		return commission*totalorderAmount;
	}
	
	private Date deductMonthFromDate() {
		Calendar cal = Calendar.getInstance();
		 cal.setTime(getCompensateMonth());
		 cal.add(Calendar.DAY_OF_MONTH, -1);
		  return cal.getTime();
	}

}
