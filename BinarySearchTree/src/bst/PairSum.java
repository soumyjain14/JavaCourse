package bst;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class PairSum {

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

//	public static void pairSumHelper(BinaryTreeNode<Integer> currentNode, int sum, BinaryTreeNode<Integer> root) {
//		if(currentNode==null) {
//			return;
//		}
//		boolean ans=isPresent(root, (sum-currentNode.data));
//		if(ans) {
//			if(currentNode.data!=Integer.MIN_VALUE) {
//				System.out.print(Math.min(currentNode.data,(sum-currentNode.data))+" "+Math.max(currentNode.data,(sum-currentNode.data)));
//				System.out.println();
//			}
//		}
//
//		pairSumHelper(currentNode.left, sum,root);
//		pairSumHelper(currentNode.right, sum,root);
//	}
//
//	public static void pairSum(BinaryTreeNode<Integer> root, int sum) {
//		pairSumHelper(root, sum, root);
//	}
//
//	public static boolean isPresent(BinaryTreeNode<Integer> root, int element) {
//		if(root==null) {
//			return false;
//		}
//		if(root.data==element) {
//			root.data=Integer.MIN_VALUE;
//			return true;
//		}
//		boolean leftTree=isPresent(root.left, element);
//		boolean rightTree=isPresent(root.right, element);
//		return leftTree || rightTree;
//	}
	
	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return 1+countNodes(root.left)+countNodes(root.right);
	}
	
	public static void pairSum(BinaryTreeNode<Integer> root, int sum) {
		if(root==null) {
			return;
		}
		int arr[]=new int[countNodes(root)];
		arr=toArray(root, arr);		
		Arrays.sort(arr);
		int i=0;int j=arr.length-1;
		while(i<=j) {
			if(arr[i]+arr[j]==sum) {
				System.out.print(arr[i]+" "+arr[j]);
				System.out.println();
				i++;
				j--;
			}else if(arr[i]+arr[j]>sum) {
				j--;
			}else {
				i++;
			}
		}
		
	}
	public static int si;
	
	public static int[] toArray(BinaryTreeNode<Integer> root,int arr[]) {
		if(root==null) {
			return null;
		}		
		arr[si++]=root.data;
		toArray(root.left,arr);
		toArray(root.right,arr);
		return arr;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		pairSum(root, 15);
		


	}

}
