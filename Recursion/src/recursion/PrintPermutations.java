package recursion;

import java.util.ArrayList;

public class PrintPermutations {
	
	public static void FindPermutations(String input, String OutputSoFar) {
		if(input.length()==0) {
			System.out.println(OutputSoFar);
			return;			
		}
		for(int i=0;i<input.length();i++) {
			FindPermutations(input.substring(0,i)+input.substring(i+1),OutputSoFar+input.charAt(i));
		}
	
	}
	
	public static void FindPermutations(String input){
		FindPermutations(input, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abc";
		FindPermutations(input);

	}

}
