package linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class RoughworkLL {
	
	public static Node<Integer> takeInput(){
		Scanner scan=new Scanner(System.in);
		Node<Integer>head=null;
		Node<Integer>tail=null;
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
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static int countLL(Node<Integer> head) {
		Node<Integer>temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		Node<Integer>temp=head;
		Node<Integer>temp1=head;
		int length=countLL(temp);
		ArrayList<Integer> list=new ArrayList<>(length);
		for(int i=0;i<length;i++) {
			list.add(temp1.data);
			temp1=temp1.next;
		}
		
		temp1=head;
		int last=length-1;int i=0;
		
		while(last>=(length/2) && i<=(length/2)) {
			
			if(list.get(i)!=list.get(last)) {
				return false;
				
			}
			
			last--;
			i++;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		boolean ans=isPalindrome(head);
		System.out.println(ans);

	}

}
