package pq;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class minPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2) {
			return 1;
		}else if(o1>02) {
			return -1;
		}else {
			return 0;
		}
	}
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length()<o2.length()) {
			return +1;
		}else if(o1.length()>o2.length()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}

public class Comparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"this","is","a","apple"};
		StringLengthComparator str =new StringLengthComparator();
		PriorityQueue<String> pq=new PriorityQueue<>(str);
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}

	}

}
