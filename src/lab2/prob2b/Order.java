package lab2.prob2b;

import java.util.ArrayList;
import java.util.Date;

public class Order { 
	private int OrderNum;
	
	private ArrayList<OrderLine> orderLines;
	
	public Order(int _orderNum) {
		this.OrderNum=_orderNum;
		orderLines=new ArrayList<OrderLine>();
	}
	
	public void addOrdeerLine(OrderLine _orderLine) {
		this.orderLines.add(_orderLine);
		
	}
	
	public void setOrdeerLine(ArrayList<OrderLine> _orderLines) {
		this.orderLines=_orderLines;
		
	}

}
