package binaryTree;

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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInput(scan);
		printTree(root);
		

	}

}
