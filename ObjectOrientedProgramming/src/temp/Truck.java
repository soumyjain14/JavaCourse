package temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
	int maxLoadCapacity;
	
	public void print1() {
		System.out.println("Truck color :"+ color);
	}
	
	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		Truck t=new Truck();
		t.color="silver";
		t.print();
	}
	

}

