package lab5;

import java.awt.print.Printable;

public class RubberDuck extends Duck{
	public RubberDuck() {
		this.setFlyBehavior(new Cannotfly());
		this.setQuackBehavior(new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("This is a RumberDuck");
	}
}
