package classes_and_objects;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray d=new DynamicArray();
		for(int i=0;i<5;i++) {
			d.add(i);
		}
		//d.print();
//		int f=d.size();
//		System.out.println(f);
//		boolean answer=d.isEmpty();
//		System.out.println(answer);
		int value=d.removeLast();
		System.out.println("value="+value);
		
		d.print();
		
		
		
		

	}

}
