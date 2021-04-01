package linkedList;

import java.util.Scanner;

public class RoughworkLL {
	
	public static Node<Integer> takeInput(){
		Scanner scan=new Scanner(System.in);
		Node<Integer>head=null;
		Node<Integer>tail=null;
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
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		
		printLL(head);

	}

}
