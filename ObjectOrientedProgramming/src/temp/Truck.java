package temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
	int maxLoadCapacity;
	
	public void print1() {
		System.out.println("Truck color :"+ color);
	}
	
	public static void main(String[] args) {
		Truck t=new Truck();
		t.color="silver";
		t.print();
	}
	

}

