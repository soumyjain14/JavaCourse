package recursion;

public class PrintCodes {

	public static void printAllPossibleCodes(String input, String OutputSoFar) {
		if(input.length()==0) {
			System.out.println(OutputSoFar);
			return;
		}
		int first=input.charAt(0)-'0';
		char a=(char)(96+first);
		printAllPossibleCodes(input.substring(1), OutputSoFar+a);
		if(input.length()>=2) {			
			int firstwo=(input.charAt(0)-'0')*10+(input.charAt(1)-'0');
			if( firstwo>10 && firstwo <=26) {				
				char b=(char)(96+firstwo);
				printAllPossibleCodes(input.substring(2), OutputSoFar+b);
			}
		}
	}

	public static void printAllPossibleCodes(String input) {
		printAllPossibleCodes(input, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="1123";
		printAllPossibleCodes(input);

		

	}

}
