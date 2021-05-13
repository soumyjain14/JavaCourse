package bst;

import java.util.LinkedList;
import java.util.Scanner;


public class ReplaceWithLargerSum {

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

	public static int sum;
	BinaryTreeNode<Integer> root;
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		replaceWithLargerNodesSum(root.right);
		sum+=root.data;
		root.data=sum;
		replaceWithLargerNodesSum(root.left);

	}
	public static int sumF(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return root.data+sumF(root.left)+sumF(root.right);
	}
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String toBePrinted=root.data+":";
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		replaceWithLargerNodesSum(root);
		printTree(root);
		//System.out.println(sumF(root.right));

	}
	//8 5 10 2 6 -1 -1 -1 -1 7 -1 -1
}
