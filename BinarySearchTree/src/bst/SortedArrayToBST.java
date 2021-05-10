package bst;

import java.util.LinkedList;



public class SortedArrayToBST {
	
	public static BinaryTreeNode<Integer> sortedArrayToBST(int arr[], int n, int si, int ei){
		if(si>ei) {
			return null;
		}
		int rootData=arr[(si+ei)/2];
		int rootIndex=(si+ei)/2;
		BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftTree=sortedArrayToBST(arr, n, si, rootIndex-1);
		BinaryTreeNode<Integer> rightTree=sortedArrayToBST(arr, n, rootIndex+1, ei);
		rootNode.left=leftTree;
		rootNode.right=rightTree;
		return rootNode;
	}
	
	public static BinaryTreeNode<Integer> sortedArrayToBST(int arr[], int n){
		return sortedArrayToBST(arr, arr.length, 0, arr.length-1);
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int n=arr.length;
		BinaryTreeNode<Integer> root=sortedArrayToBST(arr, n);
		printTreeBetter(root);

	}

}
