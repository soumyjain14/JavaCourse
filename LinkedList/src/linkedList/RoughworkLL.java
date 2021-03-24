package linkedList;

import java.util.Scanner;

public class RoughworkLL {
	static int m=0;

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

	public static Node<Integer> insertNode(Node<Integer>head,int data,int pos){
		Node<Integer> temp=head;
		Node<Integer> newNode=new Node<>(data);
		if(head==null) {
			return head;
		}
		if(pos==0) {
			newNode.next=temp;
			head=newNode;
			return head;
		}
		
		head.next=insertNode(head.next, data, pos-1);
		return head;
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
	
	public static Node<Integer> deleteNode(Node<Integer>head,int pos){
		if(head==null) {
			return head;
		}
		if(pos==0) {
			head=head.next;
			return head;
		}
		head.next=deleteNode(head.next, pos-1);
		return head;
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
		head=reverseLL(head);
		printLL(head);

	}

}
