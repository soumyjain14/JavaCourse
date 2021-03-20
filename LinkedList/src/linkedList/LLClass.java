package linkedList;

import java.util.LinkedList;

public class LLClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(2, 30);
		System.out.println(list.get(2));		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}

	}

}
