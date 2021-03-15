package linkedList;

import java.util.Scanner;

public class RemoveNode {

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
	
	public static Node<Integer> deleteNode(Node<Integer> head,int pos) {
		Node<Integer>temp=head;
		if(pos==0) {
			head=temp.next;
			return head;
		}
		int i=0;
		while(i<pos-1) {
			if(temp.next!=null) {
			temp=temp.next;
			
			}
			i++;
		}
		if(temp.next!=null) {
		temp.next=temp.next.next;
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();

		head=deleteNode(head,7);
		printLL(head);

	}

}
