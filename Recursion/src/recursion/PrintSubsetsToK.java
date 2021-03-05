package recursion;

public class PrintSubsetsToK {
	
	public static void printSubsetsSumTok(int input[], int k, int startIndex, String OutputSoFar) {
		if(startIndex==input.length) {
			if(k==0) {
			System.out.println(OutputSoFar.trim());
			}
			return;
		}
		
		printSubsetsSumTok(input, k, startIndex+1, OutputSoFar);
		printSubsetsSumTok(input, k-input[startIndex], startIndex+1, OutputSoFar+" "+input[startIndex]);
		
		
	}
	
	public static void printSubsetsSumTok(int input[], int k) {
		printSubsetsSumTok(input, k, 0, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {4,3,1};
		int k=5;
		printSubsetsSumTok(input, k);
		
		

	}

}
