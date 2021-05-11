package bst;

import java.util.LinkedList;

public class BinarySearchTree {

	public BinaryTreeNode<Integer> root;

	private BinaryTreeNode<Integer> insertNode(int data, BinaryTreeNode<Integer> root) {
		BinaryTreeNode<Integer> rootNode=null;
		if(root==null) {
			rootNode=new BinaryTreeNode<Integer>(data);
			return rootNode;
		}
		if(root.data>=data) {
			BinaryTreeNode<Integer> leftNode=insertNode(data, root.left);			
			root.left=leftNode;	
			return root;			
		}else {
			BinaryTreeNode<Integer> rightNode=insertNode(data, root.right);			
			root.right=rightNode;	
			return root;			
		}		
	}
	public void insertNode(int data) {
		root=insertNode(data, root);
	}

	private int minTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int min=root.data;
		return Math.min(min, Math.min(minTree(root.left), minTree(root.right)));
	}

	private BinaryTreeNode<Integer> deleteNode(int data, BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.data==data) {
			if(root.left==null && root.right==null) {
				return null;
			}
			if(root.left!=null && root.right!=null) {
				int min=minTree(root.right);
				root.data=min;
				BinaryTreeNode<Integer> ans=deleteNode(min, root.right);
				root.right=ans;
				return root;

			}
			if(root.right!=null) {
				return root.right;
			}
			if(root.left!=null) {
				return root.left;
			}

		}
		if(root.data>data) {
			BinaryTreeNode<Integer> leftNode=deleteNode(data, root.left);
			root.left=leftNode;
			return root;
		}
		if(root.data<data) {
			BinaryTreeNode<Integer> rightNode=deleteNode(data, root.right);
			root.right=rightNode;
			return root;
		}
		return null;
	}

	public void deleteNode(int data) {
		root=deleteNode(data, root);
	}

	private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		if(data>root.data) {
			return hasDataHelper(data, root.right);
		}else {
			return hasDataHelper(data, root.left);
		}
	}

	public boolean hasData(int data) {
		return hasDataHelper(data, root);
	}
	private void printTreeBetter(BinaryTreeNode<Integer> root) {
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

	public void printTree() {
		printTreeBetter(root);
	}


}
