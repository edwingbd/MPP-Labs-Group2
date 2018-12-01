package lab5;

public abstract class Duck {

	private IFlyBehavior flyable=new CannotFly();
	private IQuackBehavior quackable=new MuteQuack();
	public void quack() {
		quackable.quack();
	}
	
	public void fly() {
		flyable.fly();
	}
	
	public void setFlyBehavior(IFlyBehavior Behavior) {
		this.flyable=Behavior;
	}
	
	public void setQuackBehavior(IQuackBehavior Behavior) {
		this.quackable=Behavior;
	}
	
	public abstract void display();
	void swin() {
		System.out.println("swimming");
	}
}
