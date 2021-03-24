package linkedList;

import java.util.Scanner;

public class DeleteNNodes {
	
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

	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N){
		if(head==null) {
			return head;
		}
		Node<Integer> temp=head;
		Node<Integer> temp2=null;
		while(temp!=null) {
			int i=0;
			while(i<M) {
				if(temp!=null) {
				temp2=temp;
				}
				i++;
				if(temp!=null) {
					temp=temp.next;
				}

			}
			int j=0;
			while(j<N) {
				j++;
				if(temp!=null) {
					temp=temp.next;
				}
			}
			
			temp2.next=temp;
			
		}
		return head;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		head=skipMdeleteN(head, 2,3);
		printLL(head);




	}

}
