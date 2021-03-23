package linkedList;

import java.util.Scanner;

public class BubbleSortLL {
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

	public static void printLL(Node<Integer> head) {
		Node<Integer>temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;

		}
	}

	public static int countLL(Node<Integer> head) {
		int count=0;
		Node<Integer>temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

	public static Node<Integer> bubbleSort(Node<Integer> head){
		int length=countLL(head);
		for(int i=0;i<length;i++) {	
			Node<Integer> temp=head;
			Node<Integer> curr=head;
			Node<Integer> prev=null;
			Node<Integer> next=head.next;		

			while(temp!=null) {
				if(next!=null) {
					if(head==curr && curr.data>next.data) {
						curr.next=next.next;
						next.next=curr;
						head=next;
						temp=temp.next;
						prev=next;
						next=curr.next;
						temp=curr;
					}
					else if(curr.data<=next.data) {
						prev=curr;
						curr=next;
						next=next.next;
					}else {
						prev.next=curr.next;
						curr.next=next.next;
						next.next=curr;
						prev=next;
						next=curr.next;

					}
				}
				temp=temp.next;
			}
		}

		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		head=bubbleSort(head);
		printLL(head);

	}

}
