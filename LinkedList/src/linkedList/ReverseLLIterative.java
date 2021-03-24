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
		Node<Integer> prev=null;
		Node<Integer> next=curr.next;
		while(curr!=null) {
			curr.next=prev;
			prev=curr;
			curr=next;
			if(next!=null) {
				next=next.next;
			}
		}
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
