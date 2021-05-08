package binaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class CheckBalanced {
	
	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=heightOfTree(root.left);
		int rightheight=heightOfTree(root.right);
		return 1+Math.max(leftHeight, rightheight);
		
	}
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		int leftHeight=heightOfTree(root.left);
		int rightHeight=heightOfTree(root.right);
		if(Math.abs(leftHeight-rightHeight)<=1 && checkBalanced(root.left) && checkBalanced(root.right)) {
			return true;
		}
		return false;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		boolean ans=checkBalanced(root);
		System.out.println(ans);

	}

}
