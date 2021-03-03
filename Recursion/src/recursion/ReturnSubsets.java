package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnSubsets {
	
	public static int[][] subsets(int input[], int startIndex){
		if(startIndex==input.length) {
			int ans[][]=new int[1][1];
			return ans;
		}
		int first=input[startIndex];		
		
		int smallAns[][]=subsets(input,startIndex+1);
		int ans[][]=new int[smallAns.length*2][];
		int k=0;
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=new int[smallAns[i].length];
			for(int j=0;j<smallAns[i].length;j++) {
				ans[i][j]=smallAns[i][j];
			}
			k++;
		}
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=new int[smallAns[i].length+1];
			ans[k][0]=first;
			for(int j=1;j<=smallAns[i].length;j++) {
				ans[k][j]=smallAns[i][j-1];
			}
			k++;
		}
		return ans;
		
	}

	public static int[][] subsets(int input[]){
		return subsets(input,0);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {15,20,12};
		int ans[][]= subsets(input);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				
				System.out.print(ans[i][j]+" ");
				
			}
			System.out.println();
		}
		






	}

}
