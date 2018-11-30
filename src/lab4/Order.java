package lab4;

import java.util.Date;

public class Order {
	
	Commissioned comm;
	int orderNo;
	Date orderDate;
	double orderAmount;
	
	Order(){
		comm=new Commissioned();
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}

}
