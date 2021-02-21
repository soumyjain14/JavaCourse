package recursion;

public class CheckSortedNew {
	
	private static boolean checkSortedNew(int input[],int startIndex) {
		if(startIndex==input.length-1) {
			return true;
		}
		
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}
		
		boolean answ=checkSortedNew(input, startIndex+1);
		return answ;
		
	}
	
	public static boolean checkSortedNew(int input[]) {
		
		return checkSortedNew(input,0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {0,0,0,1,2};
		boolean answer=checkSortedNew(input);
		System.out.println(answer);
		

	}

}
