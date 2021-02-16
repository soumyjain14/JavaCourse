package classes_and_objects;



public class StudentUse {
	
	
	public static void main(String[] args) { 
		Student s1=new Student("Ankush",126);		
		//System.out.println(s1.name);
		//System.out.println(s1.getRollNumber());
		Student s2=new Student("Manisha",127);
		s1.print();
		s2.print();
		//System.out.println(this);
		
		System.out.println(Student.getNumStudents());
	
						
	}

}


