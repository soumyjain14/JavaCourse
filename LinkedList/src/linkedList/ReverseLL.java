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
		if(head==null) {
			return;
		}
		
		printReverse(head.next);
		System.out.print(head.data+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		printReverse(head);



	}

}
