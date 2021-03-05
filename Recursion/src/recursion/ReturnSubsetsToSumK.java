package recursion;

public class ReturnSubsetsToSumK {

	public static int[][] subsetsSumK(int input[], int startIndex, int k){
		if(startIndex==input.length) {
			if(k==0) {
				int ans[][]=new int[1][0];
				return ans;
			}
			else {
				int ans[][]=new int[0][0];
				return ans;
			}
		}

		int first=input[startIndex];
		int smallAns[][]=subsetsSumK(input, startIndex+1, k);
		int smallAns1[][]=subsetsSumK(input, startIndex+1, k-input[startIndex]);
		int ans[][]=new int[smallAns.length+smallAns1.length][];
		int m=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[m]=new int[smallAns[i].length];
			for(int j=0;j<smallAns[i].length;j++) {
				ans[i][j]=smallAns[i][j];
			}
			m++;
		}

		for(int i=0;i<smallAns1.length;i++) {
			ans[m]=new int[smallAns1[i].length+1];
			ans[m][0]=first;
			for(int j=1;j<=smallAns1[i].length;j++) {
				ans[m][j]=smallAns1[i][j-1];
			}
			m++;
		}

		return ans;

	}

	public static int[][] subsetsSumK(int input[], int k){
		return subsetsSumK(input, 0, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {3,1,2,5,2};
		int k=4;
		int ans[][]=subsetsSumK(input, k);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

	}

}
