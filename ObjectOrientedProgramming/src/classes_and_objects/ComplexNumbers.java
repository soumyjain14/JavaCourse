package classes_and_objects;

public class ComplexNumbers {
	private int realNumber;
	private int imgNumber;
	
	public ComplexNumbers(int realNumber, int imgNumber ) {
		this.realNumber=realNumber;
		this.imgNumber=imgNumber;
		
	}
	
	public void setRealNumber(int realNumber) {
		this.realNumber=realNumber;
	}
	
	public int getRealNumber() {
		return realNumber;
	}
	
	public void setImgNumber(int imgNumber) {
		this.imgNumber=imgNumber;
	}
	
	public int getImgNumber() {
		return imgNumber;
	}
	
	public void addNumber(ComplexNumbers c2) {
		realNumber=this.realNumber+c2.realNumber;
		imgNumber=this.imgNumber+c2.imgNumber;
		
	}
	
	public void multiply(ComplexNumbers c3) {
		int temp=this.realNumber;
		int temp1=this.imgNumber;
		realNumber=(this.realNumber*c3.realNumber)+(-(this.imgNumber*c3.imgNumber));
		imgNumber=(temp*c3.imgNumber)+(temp1*c3.realNumber);
	}
	
	
	
	public void print() {
		if(imgNumber<0) {
			System.out.println(realNumber+""+imgNumber+"i");
		}else {
		System.out.println(realNumber+"+"+imgNumber+"i");
		}
	}

}
