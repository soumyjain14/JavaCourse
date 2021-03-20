package linkedList;

import java.util.Scanner;

public class EvenAfterOddLL {
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
	
	public static void printLL(Node<Integer> head) {
		Node<Integer>temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;

		}
	}
	public static Node<Integer> evenAfterOdd(Node<Integer> head){
		Node<Integer> curr=head;
		Node<Integer> prev=null;
		Node<Integer> next=head.next;
		while(curr!=null) {
			if(curr.data%2!=0) {
				prev=curr;
				curr=next;
				next=next.next;
			}else {
				prev.next=next;
				curr.next=next.next;
				next.next=curr;
				next=curr.next;
			}
		}
		return head;
		
	}
	
//	public static Node<Integer> evenAfterOdd(Node<Integer> head){
//		if(head==null || head.next==null) {
//			return head;
//		}
//		
//		Node<Integer> temp=evenAfterOdd(head.next);
//		if(temp.data%2==0) {
//			return head;
//		}else {
//			if(head.data%2!=0) {
//				head.next=temp;
//				return head;
//			}else {
//				head.next=temp.next;
//				temp.next=head;
//				head=temp;
//				return head;
//			}
//		}
//		
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		head=evenAfterOdd(head);
		printLL(head);

	}

}
