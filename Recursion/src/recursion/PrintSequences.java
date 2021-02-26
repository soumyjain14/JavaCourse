package recursion;

public class PrintSequences {
	
	public static void printSequences(String str,String OutputSoFar) {
		if(str.length()==0) {
			System.out.println(OutputSoFar);
			return;
		}
		
		//Not including first element
		printSequences(str.substring(1), OutputSoFar);
		//Including first element
		printSequences(str.substring(1), OutputSoFar+str.charAt(0));
	}
	
	public static void printSequences(String str) {
		printSequences(str, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xyz";
		printSequences(str);
		

	}

}
