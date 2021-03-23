package linkedList;

import java.util.Scanner;

public class KReverse {
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
	
	public static DoubleNode reverseLL(Node<Integer> head){
		if(head==null || head.next==null) {
			DoubleNode ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		
		DoubleNode ans=new DoubleNode();
		
		ans=reverseLL(head.next);
		head.next.next=head;
		head.next=null;
		ans.tail=head;
		return ans;
	}
	
	public static Node<Integer> kReverse(Node<Integer> head, int k){
		if(k==0) {
			return head;
		}
		if(head==null) {
			return head;
		}
		int count=1;
		Node<Integer> temp=head;
		while(temp.next!=null && count!=k) {
			count++;
			temp=temp.next;
		}
		Node<Integer>head2=temp.next;
		temp.next=null;
		DoubleNode ans=new DoubleNode();
		ans=reverseLL(head);
		temp=kReverse(head2, k);
		ans.tail.next=temp;
		return ans.head;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		head=kReverse(head, 4);
		printLL(head);

	}

}
