package binaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTreeNodeUse {

	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String toBePrinted=root.data+"";
		if(root.left!=null) {
			toBePrinted+=" L:"+root.left.data+",";
		}
		if(root.right!=null) {
			toBePrinted+="R:"+root.right.data+",";
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}

	public static BinaryTreeNode<Integer> takeInput(Scanner scan){
		System.out.println("Enter the root data");
		int rootData=scan.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<Integer>(rootData);
		rootNode.left=takeInput(scan);
		rootNode.right=takeInput(scan);
		return rootNode;
	}

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
				toBePrinted+="L:"+frontNode.left.data;
				queue.add(frontNode.left);
			}
			if(frontNode.right!=null) {
				toBePrinted+="R:"+frontNode.right.data;
				queue.add(frontNode.right);
			}
			System.out.println(toBePrinted);
		}
	}
	
	public static void mirrorTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		mirrorTree(root.left);
		mirrorTree(root.right);
		swapNodes(root);
	}
	
	public static void swapNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		mirrorTree(root);
		printTreeBetter(root);


	}

}
