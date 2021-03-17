package linkedList;

import java.util.Scanner;

public class MidPointLL {
	
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

	public static int countLL(Node<Integer> head) {
		Node<Integer> temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}

	public static Node<Integer> midPoint(Node<Integer> head) {
		Node<Integer> temp=head;
		if(head==null) {
			return head;
		}
		int count=countLL(head);
		int i=0;int j=0;
		if(count%2==0) {
			j=count-1;
		}else {
			j=count;
		}
		while(i<(j/2)) {
			temp=temp.next;
			i++;
		}
		head=temp;
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
		Node<Integer>head=takeInput();
		head=midPoint(head);
		if (head != null) {
            System.out.println(head.data);
        }

	}

}
