package linkedList;

import java.util.Scanner;

public class KReverse2 {
	
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
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> temp=reverseLL(head.next);
		head.next.next=head;
		head.next=null;
		return temp;
	}
	
	
	public static Node<Integer> kReverse(Node<Integer> head, int k){
		if(head==null) {
			return head;
		}
		if(k==0) {
			return head;
		}
		int count=1;
		Node<Integer>temp=head;
		Node<Integer>tail=head;
		Node<Integer>smallAns;
		while(temp!=null && count<k) {
			count++;
			if(temp.next!=null) {
			temp=temp.next;
			}
			
		}
		Node<Integer> head2=temp.next;
		temp.next=null;
		temp=reverseLL(head);
		smallAns=kReverse(head2, k);
		Node<Integer>temp3=temp;
		if(temp3.next==null) {
			temp3.next=null;
		}else {
		while(temp3.next!=null) {
			temp3=temp3.next;
		}
		temp3.next=smallAns;
		}
		return temp;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		head=kReverse(head, 4);
		printLL(head);

	}

}
