package bst;

import java.util.LinkedList;
import java.util.Scanner;

public class IsBST {

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

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isBSTHelper(BinaryTreeNode<Integer> root, int min, int max) {
		if(root==null) {
			return true;
		}
		if(min>root.data || max<=root.data) {
			return false;
		}
		
		return (isBSTHelper(root.left, min, root.data-1) && isBSTHelper(root.right, root.data, max));
	}
	//METHOD3
//	public static boolean isBSTFinal(BinaryTreeNode<Integer> root) {
//		return isBSTpair(root).first;
//	}
//	
//	public static Pair<Boolean, Pair<Integer, Integer>> isBSTpair(BinaryTreeNode<Integer> root) {
//		if(root==null) {
//			Pair<Boolean, Pair<Integer, Integer>> output=new Pair<>();
//			output.first=true;
//			output.second=new Pair<Integer, Integer>();
//			output.second.first=Integer.MAX_VALUE;
//			output.second.second=Integer.MIN_VALUE;
//			return output;
//		}
//		Pair<Boolean, Pair<Integer, Integer>> leftOutput=isBSTpair(root.left);
//		Pair<Boolean, Pair<Integer, Integer>> rightOutput=isBSTpair(root.right);
//		int min=Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
//		int max=Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
//		boolean isBST=(root.data>leftOutput.second.second && root.data<=rightOutput.second.first) && (leftOutput.first )&& (rightOutput.first);
//		Pair<Boolean, Pair<Integer, Integer>> output=new Pair<>();
//		output.first=isBST;
//		output.second=new Pair<Integer, Integer>();
//		output.second.first=min;
//		output.second.second=max;
//		return output;		
//		
//	}
	
	
	
	
	
	//METHOD2
//	public static boolean isBST(BinaryTreeNode<Integer> root) {
//		if(root==null) {
//			return true;
//		}
//		if(maxTree(root.left)>root.data) {
//			return false;
//		}
//		if(minTree(root.right)<root.data) {
//			return false;
//		}
//		return (isBST(root.left) && isBST(root.right));
//	}
//	
//	public static int maxTree(BinaryTreeNode<Integer> root) {
//		if(root==null) {
//			return 0;
//		}
//		int max=root.data;
//		int ans1=maxTree(root.left);
//		int ans2=maxTree(root.right);
//		return Math.max(max, Math.max(ans1, ans2));
//	}
//	
//	public static int minTree(BinaryTreeNode<Integer> root) {
//		if(root==null) {
//			return Integer.MAX_VALUE;
//		}
//		int min=root.data;
//		int ans1=minTree(root.left);
//		int ans2=minTree(root.right);
//		return Math.min(min, Math.min(ans1, ans2));
//	}
//	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		System.out.println(isBST(root));

	}

}
