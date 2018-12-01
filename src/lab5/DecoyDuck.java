package lab5;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		this.setFlyBehavior( new Cannotfly());
		this.setQuackBehavior(new MuteQuack());
	}
	@Override
	public void display() {
		System.out.println("This is a DecoyDuck");
	}
}
