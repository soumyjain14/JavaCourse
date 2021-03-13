package linkedList;

import java.util.Scanner;

public class LengthOfLL {
	
	public static Node<Integer> takeInput(){
		Node<Integer>head=null;
		Node<Integer>tail=null;
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
	

	
	public static int length(Node<Integer> head) {
			
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	
	}

//	public static void printLL(Node<Integer> head) {
//		while(head!=null) {
//			System.out.print(head.data);
//			
//		}
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=length(takeInput());
		System.out.println(ans);
		
		
		

	}

}
