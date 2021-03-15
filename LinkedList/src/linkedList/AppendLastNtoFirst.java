package linkedList;

import java.util.Scanner;

public class AppendLastNtoFirst {
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

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
		int count=0;
		Node<Integer> temp=head;
		if(n==0) {
			return head;
		}
		
		else {
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		if(count<n) {
			return head;
		}else {
		
		temp=head;
		
		Node<Integer> head2;
		Node<Integer> temp1;
		int i=1;
		while(i<(count-n)) {
			temp=temp.next;
			i++;
		}
		head2=temp.next;
		temp.next=null;
		temp1=head2;
		while(temp1.next!=null) {
			temp1=temp1.next;
		}
		temp1.next=head;
		return head2;
		}
		}
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
		Node<Integer> head=takeInput();
		head=appendLastNToFirst(head, 3);
		printLL(head);

	}

}
