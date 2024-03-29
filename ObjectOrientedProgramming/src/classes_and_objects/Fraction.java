package classes_and_objects;

public class Fraction {
	private  int numerator;
	private int denominator;
	
	public Fraction(int numerator,int denominator) {
		this.numerator=numerator;
		if(denominator==0) {
			return;
			//System.out.println("NOt Allowed");
		} 
		if(denominator!=0) {
		this.denominator=denominator;
		}
		simplify();
	}
	
	private void simplify() {
		
		int gcd=1;
		int smaller=Math.min(numerator, denominator);
		for(int i=1;i<=smaller;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
			}
			
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		
	}
	
	public void setNumerator(int numerator) {
		this.numerator=numerator;
		simplify();
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int denominator) throws ZeroDenominatorException {
		if(denominator==0) {
			ZeroDenominatorException e=new ZeroDenominatorException();
			throw e;
		}else {
		this.denominator=denominator;
		simplify();
	}
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void add(Fraction f2) {
		numerator= (this.numerator*f2.denominator)+(this.denominator*f2.numerator);
		denominator=this.denominator*f2.denominator;
		simplify();
	}
	
	public void multiply(Fraction f3) {
		numerator=this.numerator*f3.numerator;
		denominator=this.denominator*f3.denominator;
		simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNum= (f1.numerator*f2.denominator)+(f1.denominator+f2.numerator);
		int newDen= f1.denominator*f2.denominator;
		Fraction f=new Fraction(newNum,newDen);
		return f;
	
	}
	public void print() {
		if(denominator==0) {
			System.out.println("Not Allowed..");
			
		} else if (denominator==1) {
			System.out.println(numerator);
		}else {
		
			System.out.println(numerator + "/"+ denominator);
		}
		
	}

}


