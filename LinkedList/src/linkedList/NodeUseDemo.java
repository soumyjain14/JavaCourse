package linkedList;

import java.util.Scanner;

public class NodeUseDemo {

	public static Node<Integer> takeInput(){
		Node<Integer> head=null;
		Node<Integer> tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		
		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
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
