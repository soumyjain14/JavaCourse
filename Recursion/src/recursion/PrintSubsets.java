package recursion;

public class PrintSubsets {
	
	public static void printSubsets(int input[], int startIndex, String OutputSoFar) {
		if(startIndex==input.length) {
			System.out.println(OutputSoFar.trim());
			return;
		}
		
		printSubsets(input, startIndex+1, OutputSoFar);
		printSubsets(input, startIndex+1, OutputSoFar+" "+input[startIndex]);
	}
	
	public static void printSubsets(int input[]) {
		printSubsets(input, 0, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {20,12};
		printSubsets(input);
		

	}

}
