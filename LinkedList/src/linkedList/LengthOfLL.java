package linkedList;

import java.util.Scanner;

public class LengthOfLL {
	public static int length(Node<Integer> head) {
			
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int ans=length(/*some Node to enter*/);
		//System.out.println(ans);
		
		
		

	}

}
