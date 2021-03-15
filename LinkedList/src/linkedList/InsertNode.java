package linkedList;

import java.util.Scanner;

public class InsertNode {

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

	public static Node<Integer> insert(Node<Integer>head, int data, int pos) {
		Node<Integer>temp=head;
		Node<Integer> newNode=new Node<Integer>(data);
		int i=0;
		if(pos==0) {
			newNode.next=temp;
			head=newNode;
		}else {
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
			newNode.next=temp.next;
			temp.next=newNode;
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
		
		head=insert(head, 80, 3);
		printLL(head);





	}

}
