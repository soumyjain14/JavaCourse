package classes_and_objects;

public class FractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1=new Fraction(4,16);
		f1.print();
		// 1/4
		f1.setNumerator(16);
		f1.print();
		// 4
		f1.setDenominator(20);
		f1.print();
		// 1/5
		Fraction f2=new Fraction(2, 3);
		f1.add(f2);
		f1.print();
		// 13/15
		Fraction f3=new Fraction(15,13);
		f1.multiply(f3);
		f1.print();
		// 1
		Fraction f4=Fraction.add(f1,f3);
		f4.print();
		f1.print();
		f3.print();
		
		
		

	}

}
