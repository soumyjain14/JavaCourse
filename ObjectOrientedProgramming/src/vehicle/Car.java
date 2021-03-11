package vehicle;

public class Car extends Vehicle{

	int gears;
	boolean isConvertible;
	
	public Car() {
		
	}
	
	public Car(String color, int maxSpeed) {
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void print1() {
		super.print();
		
		System.out.println("Car color :"+color);
		System.out.println("Car speed :"+maxSpeed);
		System.out.println("Car gears :"+gears);
		System.out.println("Car Conversion :"+isConvertible);
	}
	

}


