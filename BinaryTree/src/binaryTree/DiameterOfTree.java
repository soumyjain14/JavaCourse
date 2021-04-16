package binaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class DiameterOfTree {
	
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

	public static int diameterOfTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int option1=height(root.left)+height(root.right);
		int option2=diameterOfTree(root.left);
		int option3=diameterOfTree(root.right);
		return Math.max(option1, Math.max(option2, option3));
		
	}
	
	public static Pair<Integer, Integer> diameterBetter(BinaryTreeNode<Integer> root){
		if(root==null) {
			Pair<Integer,Integer> output=new Pair<>();
			output.height=0;
			output.diameter=0;
			return output;
		}
		
		Pair<Integer, Integer> leftOutput=diameterBetter(root.left);
		Pair<Integer, Integer> rightOutput=diameterBetter(root.right);
		int height=1+Math.max(leftOutput.height, rightOutput.height);
		int option1=leftOutput.height+rightOutput.height;
		int option2=leftOutput.diameter;
		int option3=rightOutput.diameter;
		int diameter=Math.max(option1, Math.max(option2, option3));
		Pair<Integer,Integer> output=new Pair<>();
		output.height=height;
		output.diameter=diameter;
		return output;
	}
	
	

	public static int height(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		
		int lh=height(root.left);
		int rh=height(root.right);
		return 1+Math.max(lh, rh);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		System.out.println("diameter: "+diameterBetter(root).diameter);
		System.out.println("height: "+diameterBetter(root).height);

	}

}
