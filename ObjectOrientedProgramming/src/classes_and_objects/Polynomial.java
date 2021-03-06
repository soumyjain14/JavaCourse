package classes_and_objects;

public class Polynomial {
	int coeff;
	int degree;

	int coefficient[]=new int[100];

	public void setCoefficient(int degree, int coeff) {
		coefficient[degree]=coeff+coefficient[degree];
	}

	public void add(Polynomial p2) {
		if(this.degree==p2.degree) {
			for(degree=0;degree<1000;degree++) {
				this.coefficient[degree]=p2.coefficient[degree]+this.coefficient[degree];

			}
		}
	}

	public void subtract(Polynomial p3) {
		if(this.degree==p3.degree) {
			for(degree=0;degree<100;degree++) {
				this.coefficient[degree]=this.coefficient[degree]-p3.coefficient[degree];
				//System.out.println(this.coefficient[degree]);
			}
		}

	}
	
	public Polynomial multiply(Polynomial p4) {
		Polynomial a=new Polynomial();
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a.coefficient[(i+j)]+=this.coefficient[i]*p4.coefficient[j];
				
			}
			
		}
		return a;
		
	}

	public void print() {
		for(int i=0;i<coefficient.length;i++) {
			if(coefficient[i]!=0) {
				System.out.print(coefficient[i]+"x"+"^"+i+" ");
			}
		}
		System.out.println();

	}

}


