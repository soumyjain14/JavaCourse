package vehicle;

/*public class Car extends Vehicle{

	int gears;
	boolean isConvertible;
	
	public void print1() {
		System.out.println("Car color :"+color);
		System.out.println("Car speed :"+maxSpeed);
		System.out.println("Car gears :"+gears);
		System.out.println("Car Conversion :"+isConvertible);
	}
	void props() {
        Vehicle v = new Vehicle();
        v.color = "Vehicle 1st";      
    }

}*/

class Car {
    private int seats;
    private int speed;

    public Car() {
    System.out.print("This Is Car ");
    }
}

class Audi extends Car {
    Audi() {
    System.out.print("This Is Audi ");
    //super();
    }
} 

class Main {
    public static void main(String args[]) {
    Audi a = new Audi();
    }         
}
