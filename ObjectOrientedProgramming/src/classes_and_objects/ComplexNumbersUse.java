package classes_and_objects;

public class ComplexNumbersUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumbers c1=new ComplexNumbers(4,5);
		c1.print();
//		c1.setRealNumber(3);
//		c1.print();
//		c1.setImgNumber(5);
//		c1.print();
		ComplexNumbers c2=new ComplexNumbers(1,-2);
//		c1.addNumber(c2);
		c2.print();
//		c1.conjugate();
		c1.multiply(c2);
		c1.print();
		c2.print();
		

	}

}
