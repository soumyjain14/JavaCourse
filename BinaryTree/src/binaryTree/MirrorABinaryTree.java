package binaryTree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class MirrorABinaryTree {

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

	
	public static void printTreeBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}

		LinkedList<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			
			BinaryTreeNode<Integer> frontNode=queue.poll();
			String toBePrinted="";
			
				toBePrinted=frontNode.data+":";	
				if(frontNode.left!=null) {
				toBePrinted+="L:"+frontNode.left.data+",";
				queue.add(frontNode.left);
				}else {
					toBePrinted+="L:"+"-1"+",";
					//queue.poll();
				}
				if(frontNode.right!=null) {
				toBePrinted+="R:"+frontNode.right.data+",";
				queue.add(frontNode.right);	
				}else {
					toBePrinted+="R:"+"-1"+",";
					//queue.poll();
				}			
				
					System.out.println(toBePrinted);
	
		}
	}
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		swapNodes(root);
	}
	
	public static void swapNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		BinaryTreeNode<Integer> temp=root.right;
		root.right=root.left;
		root.left=temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		mirrorBinaryTree(root);
		printTreeBetter(root);

	}

}




