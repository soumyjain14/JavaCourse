package classes_and_objects;

public class PolynomialUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynomial p1=new Polynomial();
		p1.setCoefficient(3,5);
		p1.setCoefficient(2,3);
		p1.setCoefficient(2, 7);
		Polynomial p2=new Polynomial();
		p2.setCoefficient(0,7);
		p2.setCoefficient(1, 8);
		p1.print();
		p2.print();
//		Polynomial1 a=p1.add(p2);
//		a.print1();
		p1.subtract(p2);
		p1.print();
//		Polynomial1 a=p1.multiply(p2);
//		a.print1();
		
		
	}

}
