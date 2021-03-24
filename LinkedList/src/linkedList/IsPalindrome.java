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
	public static void printLL(Node<Integer> head) {
		Node<Integer>temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
	}
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> temp=reverseLL(head.next);
		head.next.next=head;
		head.next=null;
		return temp;
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
	public static Node<Integer> midPoint(Node<Integer> head) {
		Node<Integer>slow=head;
		Node<Integer>fast=head;
		if(head==null) {
			return head;
		}
		while(fast!=null && fast.next!=null) {
			
			fast=fast.next.next;
			slow=slow.next;			
		}		
		return slow;	
		
	}
	

	public static Node<Integer> isPalindrome(Node<Integer> head) {
		Node<Integer> temp2=head;
		Node<Integer> mid=midPoint(head);
		printLL(mid);
		Node<Integer> temp=reverseLL(mid);
		//printLL(temp);
		int count=getLength(head);
		int i=1;
		while(i<(count/2)) {
			temp2=temp2.next;
			i++;
		}
		temp2.next=temp;
		return head;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
//		boolean ans=isPalindrome(head);
//		System.out.println(ans);
		head=isPalindrome(head);
		printLL(head);

	}

}
