package leetcode;

import java.util.LinkedList;
import java.util.Scanner;

import leetcode.TreeNode;

public class DeepestSumLeaves {
	
	public static TreeNode<Integer> takeInputBetter(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData=scan.nextInt();
		TreeNode<Integer> rootNode=new TreeNode<Integer>(rootData);
		LinkedList<TreeNode<Integer>> queue=new LinkedList<>();
		queue.add(rootNode);
		while(!queue.isEmpty()) {
			TreeNode<Integer> frontNode=queue.poll();			
			System.out.println("Enter the number of children of "+ frontNode.data);
			int childCount=scan.nextInt();
			for(int i=0;i<childCount;i++) {
				System.out.println("Enter the value of "+(i+1)+" th child of "+frontNode.data);
				int child=scan.nextInt();
				TreeNode<Integer>childNode=new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				queue.add(childNode);
			}
		}
		return rootNode;
	}

	public static int depthTree(TreeNode<Integer> root, int depth) {
		if(depth>=0 && root.children.size()==0) {
			return depth;
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<root.children.size();i++) {
			int count=depthTree(root.children.get(i), depth+1);
			if(count>=max) {
				max=count;
			}
		}
		return max;
	}
	
	public static int deepSum(TreeNode<Integer> root, int maxDepth) {
		if(maxDepth==0 && root.children.size()==0) {
			return root.data;
		}
		int sum=0;
		for(int i=0;i<root.children.size();i++) {
			sum=sum+deepSum(root.children.get(i), maxDepth-1);
		}
		return sum;
		
	}
	
	public static int deepestLeavesSum(TreeNode<Integer> root) {
		int maxDepth=depthTree(root, 0);
		int ans=deepSum(root, maxDepth);
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=takeInputBetter();
		int ans=deepestLeavesSum(root);
		System.out.println(ans);
		
		

	}

}
