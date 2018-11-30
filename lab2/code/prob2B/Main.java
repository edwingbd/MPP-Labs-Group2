package prob2B;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order=new Order(1);
		OrderLine ol1=new OrderLine(order);
		OrderLine ol2=new OrderLine(order);
		 		
		order.addOrdeerLine(ol1);
		order.addOrdeerLine(ol2);
		
	}

}
