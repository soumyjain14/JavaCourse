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
		Node<Integer> temp=head;
		Node<Integer> OddHead=null;
		Node<Integer> OddTail=null;
		Node<Integer> EvenHead=null;
		Node<Integer> EvenTail=null;
		while(temp!=null) {
			if(temp.data%2!=0) {
				if(OddHead==null) {
					OddHead=temp;
					OddTail=temp;					
				}else {
					OddTail.next=temp;
					OddTail=temp;					
				}
			}else {
				if(EvenHead==null) {
					EvenHead=temp;
					EvenTail=temp;					
				}else {
					EvenTail.next=temp;
					EvenTail=temp;
				}
			}
			temp=temp.next;
		}
		if(OddHead!=null) {
			if(EvenHead!=null) {
				EvenTail.next=null;
				OddTail.next=EvenHead;
			}else {
				OddTail.next=null;
			}
			return OddHead;
		}else {
			EvenTail.next=null;
			return EvenHead;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		head=evenAfterOdd(head);
		printLL(head);

	}

}
