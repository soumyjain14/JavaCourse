package binaryTree;

import java.util.LinkedList;



public class TreeFromInPre {
	
	public static BinaryTreeNode<Integer> helperFunction(int preOrder[], int inOrder[], int PreS, int PreE, int InS, int InE){
		if(InS>InE) {
			return null;
		}
		int root=preOrder[PreS];
		int rootIndex=-1;
		BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<Integer>(root);
		for(int i=InS;i<=InE;i++) {
			if(root==inOrder[i]) {
				rootIndex=i;
				break;
			}					
		}
		int LPreS=PreS+1;
		int LInS=InS;
		int LInE=rootIndex-1;
		int LPreE=LInE-LInS+LPreS;
		int RPreS=LPreE+1;
		int RPreE=PreE;
		int RInS=rootIndex+1;
		int RInE=InE;
		BinaryTreeNode<Integer> leftTree=helperFunction(preOrder, inOrder, LPreS, LPreE, LInS, LInE);
		BinaryTreeNode<Integer> rightTree=helperFunction(preOrder, inOrder, RPreS, RPreE, RInS, RInE);
		rootNode.left=leftTree;
		rootNode.right=rightTree;
		return rootNode;
		
	}
	
	public static BinaryTreeNode<Integer> buildTree(int preOrder[], int inOrder[]){
		return helperFunction(preOrder, inOrder,0,preOrder.length-1,0,inOrder.length-1);
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
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
				toBePrinted+="L:"+frontNode.left.data+",";
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
		int preOrder[]= {1,2,4,5,3,6,7};
		int inOrder[]= {4,2,5,1,6,3,7};		
		BinaryTreeNode<Integer> root=buildTree(preOrder, inOrder);
		printLevelWise(root);



	}

}
