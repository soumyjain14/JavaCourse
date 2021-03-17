package linkedList;

import java.util.Scanner;

public class EliminateDuplicates {
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

	public static Node<Integer> removeDuplicates(Node<Integer> head){
		if(head==null) {
			return head;
		}
		Node<Integer> t1=head;
		Node<Integer> t2;
		t2=t1.next;
		while(t2!=null) {
			if(t1.data.equals(t2.data)) {
				t1.next=t2.next;
				t2=t2.next;
			}else {
				t1=t2;
				t2=t2.next;
			}

		}
		t1.next=t2;
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
		head=removeDuplicates(head);
		printLL(head);

	}

}
