package recursion;

public class CheckSortedNew {
	
	public static boolean checkSortedNew(int input[],int startIndex) {
		if(startIndex==input.length-1) {
			return true;
		}
		
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}
		
		boolean answ=checkSortedNew(input, startIndex+1);
		return answ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {0,0,0,0,1,0};
		boolean answer=checkSortedNew(input,0);
		System.out.println(answer);
		

	}

}
