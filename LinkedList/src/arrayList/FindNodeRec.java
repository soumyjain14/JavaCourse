package arrayList;

import java.util.Scanner;

import linkedList.Node;

public class FindNodeRec {
	static int i;
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

	public static void printLL(Node<Integer> head) {
		Node<Integer>temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}


	public static int findNodeRec(Node<Integer> head, int n) {
		if(head==null) {
			return -1;
		}				
		if(head.data.equals(n)) {			
			return i;
		}else {
			i++;
			int smallAns=findNodeRec(head.next, n);
			return smallAns;
		}	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		int ans=findNodeRec(head, 3);
		System.out.println(ans);
	}

}
