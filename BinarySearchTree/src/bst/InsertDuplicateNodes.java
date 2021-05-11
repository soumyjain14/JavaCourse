package bst;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertDuplicateNodes {
	
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

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		BinaryTreeNode<Integer> leftNode=new BinaryTreeNode<Integer>(root.data);
		if(root.left==null && root.right==null) {
			root.left=leftNode;
			return;
		}
		if(root.left!=null) {
			BinaryTreeNode<Integer> temp=root.left;
			root.left=leftNode;
			leftNode.left=temp;
		}
		if(root.right!=null) {
			root.left=leftNode;
		}
		
		insertDuplicateNode(root.left.left);
		insertDuplicateNode(root.right);
	}
	public static  void printTreeBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String toBePrinted=root.data+":";
		if(root.left!=null) {
			toBePrinted+="L:"+root.left.data+",";
		}
		if(root.right!=null) {
			toBePrinted+="R:"+root.right.data;
		}
		System.out.println(toBePrinted);
		printTreeBetter(root.left);
		printTreeBetter(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		insertDuplicateNode(root);
		printTreeBetter(root);
		

	}

}
