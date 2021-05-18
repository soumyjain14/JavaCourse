package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveLeafNodes {
	
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
	
	public static TreeNode<Integer> removeLeaf(TreeNode<Integer> root){
		if(root == null || root.children.size() == 0){
            return null;
        }

        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i=0;i < root.children.size();i++){
            TreeNode<Integer> child = root.children.get(i);
            if(child.children.size() == 0){
                indexes.add(i); 
            }
        }

        for(int i = indexes.size()-1;i >= 0; i--){
            int j = indexes.get(i);
            root.children.remove(j);
        }

        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> child = removeLeaf(root.children.get(i));
            if(child == null){
                root.children.remove(i);
            }
        }

        return root;
	}
	
	public static void printTreeBetter(TreeNode<Integer> rootNode) {
		LinkedList<TreeNode<Integer>> queue=new LinkedList<>();
		queue.add(rootNode);
	
		System.out.println(rootNode.data);
		while(!queue.isEmpty()) {
			
			TreeNode<Integer> frontNode=queue.poll();
			
			String s="";
			for(int i=0;i<frontNode.children.size();i++) {
				s=s+frontNode.children.get(i).data+" ";
				
				queue.add(frontNode.children.get(i));
							
			}
			System.out.println(s);
			
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root=takeInputBetter();
		root=removeLeaf(root);
		printTreeBetter(root);

	}

}
