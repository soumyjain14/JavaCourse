package bst;

import java.util.LinkedList;
import java.util.Scanner;

public class LargestBSTSubtree {
	
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

	public static int largestBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(isBST(root)) {
			return heightTree(root);
		}else {
			return Math.max(largestBST(root.left), largestBST(root.right));
		}
		
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static boolean isBST(BinaryTreeNode<Integer> root,int min,int max) {
		if(root==null) {
			return true;
		}
		if(min>root.data || max<root.data) {
			return false;
		}
		return isBST(root.left, min, root.data-1) && isBST(root.right, root.data+1, max);
		
	}
	
	public static int heightTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return 1+Math.max(heightTree(root.left),heightTree(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		System.out.println(largestBST(root));

	}

}
