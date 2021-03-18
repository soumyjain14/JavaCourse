package linkedList;

import java.util.Scanner;

public class MergeTwoSortedLL {
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
	
	 public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2){
		if(head1==null) {
			return head2;
		}
		if(head2==null) {
			return head1;
		}
		Node<Integer>temp1=head1;
		Node<Integer> temp2=head2;
		if(temp1.data<temp2.data) {
			temp1.next=mergeTwoSortedLinkedLists(temp1.next, temp2);
			return temp1;
		}else {
			temp2.next=mergeTwoSortedLinkedLists(temp1, temp2.next);
			return temp2;
		}
	 }
	 
	 public static void printLL(Node<Integer> head) {
			Node<Integer>temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1=takeInput();
		Node<Integer> head2=takeInput();
		Node<Integer> h3=mergeTwoSortedLinkedLists(head1, head2);
		printLL(h3);
		

	}

}
