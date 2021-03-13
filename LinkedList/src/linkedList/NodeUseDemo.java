package linkedList;

import java.util.Scanner;

public class NodeUseDemo {

	public static Node<Integer> takeInput(){
		Node<Integer> head=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();

		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
			}else {
				Node<Integer>temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
			data=s.nextInt();

		}
		return head;

	}

	public static void printLL(Node<Integer> head) {
		Node<Integer> temp=head;
		while(head!=null) {
			System.out.print(head.data+ " ");
			head=head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		printLL(head);





	}

}
