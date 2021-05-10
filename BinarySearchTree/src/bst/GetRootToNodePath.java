package bst;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GetRootToNodePath {

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



	public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data){
		if(root==null){
			return null;
		}
		if(root.data==data){
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		if(root.data>data) {
			ArrayList<Integer> leftOutput=getRootToNodePath(root.left,data);
			if(leftOutput!=null){
				leftOutput.add(root.data);
				return leftOutput;
			}
		}else {
			ArrayList<Integer> rightOutput=getRootToNodePath(root.right,data);
			if(rightOutput!=null){
				rightOutput.add(root.data);
				return rightOutput;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();		
		ArrayList<Integer> output=getRootToNodePath(root, 10);
		for(int i=0;i<output.size();i++) {
			System.out.print(output.get(i)+" ");
		}

	}

}
