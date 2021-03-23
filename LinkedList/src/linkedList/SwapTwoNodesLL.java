package linkedList;

import java.util.Scanner;

public class SwapTwoNodesLL {
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
	public static Node<Integer> swapNodes(Node<Integer> head, int M, int N) {
		Node<Integer> temp=head;
		int i=0;
		Node<Integer> temp2=null;
		Node<Integer> first=null;
		Node<Integer> adj1=null;
		Node<Integer> temp3=null;
		Node<Integer> second=null;
		Node<Integer> adj2=null;
		while(temp!=null) {
			if(i==M-1) {
				temp2=temp;
				first=temp2.next;
				adj1=first.next;
				temp=temp.next;
				i++;
			}
			if(i==N-1) {
				temp3=temp;
				second=temp3.next;
				adj2=second.next;
				temp=temp.next;
				i++;
			}
			i++;
			temp=temp.next;
		}
		if((N-M)==1 || (M-N)==1) {
			first.next=adj2;
			second.next=first;
			temp2.next=second;
			return head;
		}
		first.next=adj2;
		second.next=adj1;
		temp2.next=second;
		 
		temp3.next=first;
		
		return head;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		head=swapNodes(head, 3,4);
		printLL(head);

	}

}
