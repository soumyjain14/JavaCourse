package linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class IsPalindrome {

	public static Node<Integer> takeInput(){
		Node<Integer> head=null;
		Node<Integer> tail=null;
		Scanner scan=new Scanner(System.in);
		int data=scan.nextInt();

		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;				
			}else {
				tail.next=newNode;
				tail=newNode;

			}
			data=scan.nextInt();
		}
		return head;
	}
	
	public static int getLength(Node<Integer> head) {
		Node<Integer> temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

	public static boolean isPalindrome(Node<Integer> head) {
		int length=getLength(head);
		ArrayList<Integer> list1=new ArrayList<>(length);
		for(int i=0;i<length;i++) {
			list1.add(head.data);
			head=head.next;
		}
		
		int tail=length-1;
		int i=0;
		boolean ans=true;
		while(i<=tail) {
			if(list1.get(i)!=list1.get(tail)) {
				ans=false;
				return ans;
			}
			i++;
			tail--;
		}
		return ans;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		boolean ans=isPalindrome(head);
		System.out.println(ans);

	}

}
