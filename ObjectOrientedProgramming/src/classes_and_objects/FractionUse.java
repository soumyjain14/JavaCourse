package classes_and_objects;

public class FractionUse {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Fraction f1=new Fraction(4,5);
		f1.print();
		// 1/4
//		f1.setNumerator(16);
//		f1.print();
		// 4
		try {
			f1.setDenominator(0);;
		}
		catch(ZeroDenominatorException e){
			System.out.println("Denominator is set to 0");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Ar");
		}
		finally {
			System.out.println("I am always there");
		}
		
		
//		// 1/5
//		Fraction f2=new Fraction(2, 3);
//		f1.add(f2);
//		f1.print();
//		// 13/15
//		Fraction f3=new Fraction(15,13);
//		f1.multiply(f3);
//		f1.print();
//		// 1
//		Fraction f4=Fraction.add(f1,f3);
//		f4.print();
//		f1.print();
////		f3.print();
		
		
		

	}

}
