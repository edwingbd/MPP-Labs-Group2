package lab5;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("This is a MallardDuck");
	}
}
