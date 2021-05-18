package bst;

import java.util.LinkedList;
import java.util.Scanner;

public class NodesAtDistanceK {
	
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

	public static boolean areCousins(BinaryTreeNode<Integer> root, int p, int q) {
		if(root==null) {
			return true;
		}
		int pDepth=depthTree(root, p, 0);
		int qDepth=depthTree(root, q, 0);
		if(pDepth!=qDepth) {
			return false;
		}
		if(pDepth==qDepth) {
			if(root.left.data==p && root.right.data==q) {
				return false;
			}
		}
		
		return areCousins(root.left, p, q) || areCousins(root.right, p, q);
		
	}
	
	public static int depthTree(BinaryTreeNode<Integer> root, int value, int depth) {
		if(root==null) {
			return 0;
		}
		if(root.data==value) {
			return depth;
		}
		return Math.max(depthTree(root.left, value, depth+1), depthTree(root.right, value, depth+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		System.out.println(areCousins(root, 6, 10));
		System.out.println(depthTree(root, 2, 0));

	}

}
