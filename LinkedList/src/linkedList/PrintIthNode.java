package linkedList;

import java.util.Scanner;

public class PrintIthNode {
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

	public static void printIthNode(Node<Integer> head, int i) {
		int count=0;
		while(head!=null) {
			if(count==i) {
				System.out.println(head.data);
				head=null;
			}else {
				head=head.next;
				count++;
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printIthNode(takeInput(), 3);

	}

}
