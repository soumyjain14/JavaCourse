package bst;

import java.util.LinkedList;
import java.util.Scanner;

public class GetLCA {

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

	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null) {
			return -1;
		}
		if(a==root.data || b==root.data) {
			return root.data;
		}
		int leftAns=getLCA(root.left, a, b);
		int rightAns=getLCA(root.right, a, b);
		if(leftAns!=-1 && rightAns!=-1) {
			return root.data;
		}else if(leftAns!=-1) {
			return leftAns;
		}else if(rightAns!=-1) {
			return rightAns;
		}else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		int ans=getLCA(root, 3, 9);
		System.out.println(ans);

	}

}
