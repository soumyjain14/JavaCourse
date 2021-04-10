package tree;

import java.util.LinkedList;
import java.util.Scanner;

public class ReplaceWithDepthValue {
	
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

	
	public static void depthTree(TreeNode<Integer> root) {
		LinkedList<TreeNode<Integer>> queue=new LinkedList<>();
		queue.add(root);
		System.out.println("0");
		int count=1;
		while(!queue.isEmpty()) {
			int size=queue.size();
			while(size!=0) {
				TreeNode<Integer> frontNode=queue.poll();
				String s="";
				for(int i=0;i<frontNode.children.size();i++) {
					s=s+count+" ";
					queue.add(frontNode.children.get(i));
				}
				
				size--;
				if(size!=0) {
				System.out.print(s);
				}else {
					System.out.println(s);
				}
			}
			count++;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=takeInputBetter();
		depthTree(root);

	}

}
