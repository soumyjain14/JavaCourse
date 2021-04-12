package binaryTree;

import java.util.Scanner;

public class BinaryTreeNodeUse {
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String s=root.data+"";
		if(root.left!=null) {
			s=s+"L"+root.left.data+",";
		}
		if(root.right!=null) {
			s=s+"R"+root.right.data+",";
		}
		System.out.println(s);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter the root data");
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<Integer>(rootData);
		rootNode.left=takeInput(s);
		rootNode.right=takeInput(s);
		return rootNode;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInput(scan);
		printTree(root);
		

	}

}
