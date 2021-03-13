package arrayList;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		ArrayList<String> list1=new ArrayList<>();
		System.out.println(list.size());
		list.add(10);
		list.add(15);
		list.add(25);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		list.add(0, 50);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		
		list.remove(2);
		list.set(0, 75);
		for(int element : list) {
			System.out.print(element + " ");
		}
		
		

	}

}
