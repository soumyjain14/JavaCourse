package classes_and_objects;

public class Student {
	public String name;
	private final int rollNo;
	private static int numStudents;
	
	public Student(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		numStudents++;
		
	}
	
//	public void setRollNumber(int rn) {
//		if (rn>0) {
//		rollNo=rn;
//	}
//}
	public static int getNumStudents() {
		return numStudents;
	}
	
	public int getRollNumber() {
		return rollNo;
	}
	
	public void print() {
		System.out.println(name+" : "+rollNo);
	}

}
