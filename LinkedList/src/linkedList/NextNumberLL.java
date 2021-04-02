package linkedList;

import java.util.Scanner;

public class NextNumberLL {
	
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
	
	public static Node<Integer> reverseLL(Node<Integer> head) {
		Node<Integer> prev = null;
        Node<Integer> current = head;
        Node<Integer> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
	}
	
	public static Node<Integer> addOneUtil(Node<Integer> head)
    {
        
        Node<Integer> res = head;
        Node<Integer> temp = null, prev = null;
 
        int carry = 1, sum;
 
        while (head != null) {
            sum = carry + head.data;            
            carry = (sum >= 10) ? 1 : 0;
 
           
            sum = sum % 10;
 
            head.data = sum;
 
           
            temp = head;
            head = head.next;
        }
 
       
        if (carry > 0) {
        	Node<Integer>newNode=new Node<>(carry);
            temp.next = newNode;
        }
 
        
        return res;
    }
 
    
    static Node<Integer> addOne(Node<Integer> head)
    {
        
        head = reverseLL(head);
 
        head = addOneUtil(head);
 
        
        return reverseLL(head);
    }
 
 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=takeInput();
		head=addOne(head);
		printLL(head);

	}

}
