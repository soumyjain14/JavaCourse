package binaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class CountNodes {
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

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int ans=1;
		ans+=countNodes(root.left)+countNodes(root.right);
		return ans;
	}

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		boolean ans=false;
		if(root.left!=null) {
			ans=isNodePresent(root.left, x);
			if(ans==true) {
				return ans;
			}
			
		}
		if(root.right!=null) {
			ans=isNodePresent(root.right, x);
			if(ans==true) {
				return ans;
			}
			
		}
		return ans;
		
	}
	
	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		if(root.left==null && root.right==null) {
			return 1;
		}
		int ans=0;int max1=Integer.MIN_VALUE;int max2=Integer.MIN_VALUE;
		if(root.left!=null) {
			ans=ans+heightOfTree(root.left);
			if(ans>=max1) {
				max1=ans;
			}
		}
		ans=0;
		if(root.right!=null) {
			ans=ans+heightOfTree(root.right);
			if(ans>=max2) {
				max2=ans;
			}
		}
		int max=Math.max(max1, max2);
		return max+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		System.out.println(heightOfTree(root));

	}

}
