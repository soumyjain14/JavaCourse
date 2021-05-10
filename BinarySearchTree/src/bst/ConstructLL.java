package bst;

import java.util.LinkedList;
import java.util.Scanner;

public class ConstructLL {

	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner scan=new Scanner(System.in);
		LinkedList<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		System.out.println("Enter the root data");
		int rootData=scan.nextInt();
		BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<Integer>(rootData);
		queue.add(rootNode);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> frontNode=queue.poll();
			if(frontNode==null) {
				return null;
			}
			BinaryTreeNode<Integer> leftNode=null;
			BinaryTreeNode<Integer> rightNode=null;
			System.out.println("enter the left data for "+frontNode.data);
			int leftData=scan.nextInt();
			if(leftData!=-1) {
				leftNode=new BinaryTreeNode<Integer>(leftData);
			}
			frontNode.left=leftNode;
			if(leftNode!=null) {
				queue.add(leftNode);
			}
			System.out.println("enter the right data for "+frontNode.data);
			int rightData=scan.nextInt();
			if(rightData!=-1) {
				rightNode=new BinaryTreeNode<Integer>(rightData);
			}			
			frontNode.right=rightNode;
			if(rightNode!=null) {
				queue.add(rightNode);
			}


		}

		return rootNode;
	}

	public static Node<Integer> constructLL(BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		Node<Integer> leftLL=constructLL(root.left);
		Node<Integer> rootNode=new Node<Integer>(root.data);
		if(leftLL!=null) {
			Node<Integer> temp=leftLL;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=rootNode;
			Node<Integer> rightLL=constructLL(root.right);
			rootNode.next=rightLL;
			return leftLL;
		}else {
			Node<Integer> rightLL=constructLL(root.right);
			rootNode.next=rightLL;
			return rootNode;
		}

	}

	public static void printLL(Node<Integer> head) {
		if(head==null) {
			return;
		}
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		Node<Integer> head=constructLL(root);
		printLL(head);

	}

}
