package linkedList;

import java.util.Scanner;

public class ReverseLL {
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

	public static void printReverse(Node<Integer> head) {
		Node<Integer> temp=head;
		Node<Integer> temp2=head;
		int count=0;
		while(temp.next!=null) {
			temp=temp.next;
			count++;
		}

		head=temp;

		int i=0;
		while(i<count) {
			temp=temp2;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next.next=temp;
			temp.next=null;
			i++;
		}

		temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}









	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		printReverse(head);



	}

}
