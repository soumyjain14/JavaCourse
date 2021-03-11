package vehicle;

public abstract class Vehicle {
	protected String color;
	int maxSpeed;
	
	public Vehicle() {
		this.color="Golden";
		this.maxSpeed=200;
	}
	
	public abstract boolean isMotorized();
		
	
	
	public Vehicle(String color, int maxSpeed ) {
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	public void print() {
		System.out.println("vehicle color :"+this.color);
		System.out.println("vehicle speed :"+this.maxSpeed);
	}
}
