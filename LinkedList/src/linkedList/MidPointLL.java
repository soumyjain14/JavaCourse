package linkedList;

import java.util.Scanner;

public class MidPointLL {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head=null;
		Node<Integer> tail=null;
		Scanner scan=new Scanner(System.in);
		int data=scan.nextInt();

		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data);
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

	

	public static Node<Integer> midPoint(Node<Integer> head) {
		Node<Integer>slow=head;
		Node<Integer>fast=head;
		if(head==null) {
			return head;
		}
		while(fast.next!=null && fast.next.next!=null) {
			
			fast=fast.next.next;
			slow=slow.next;			
		}		
		return slow;	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		head=midPoint(head);
		while(head!=null) {
			System.out.println(head.data);
			break;
		}
		
	}

}
