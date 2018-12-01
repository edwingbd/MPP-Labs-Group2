package lab5;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBehavior(new Quack());
	}
	@Override
	public void display() {
		System.out.println("This is a RedheadDuck");
	}
}
