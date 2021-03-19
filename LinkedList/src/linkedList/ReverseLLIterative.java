package linkedList;

import java.util.Scanner;

public class ReverseLLIterative {
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
	
	public static Node<Integer> reverseI(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> curr=head;
		Node<Integer> prev=head;
		Node<Integer> next=head.next;
		Node<Integer> next2=next.next;
		while(next!=null) {
			curr=next;
			curr.next=prev;
			prev=next;
			next=next2;
			if(next2!=null) {
				next2=next2.next;
			}
		}
		head.next=null;
		return prev;
	}
	
	public static void printLL(Node<Integer> head) {
		Node<Integer>temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		head=reverseI(head);
		printLL(head);


	}

}
