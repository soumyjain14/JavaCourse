package recursion;

public class CheckNumber {
	
	public static boolean checkNumber(int input[], int x) {
		if(input.length==1 && input[0]!=x) {
			return false;
		}
		if(input[0]==x) {
			return true;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArray[i-1]=input[i];
		}
		
		boolean answer=checkNumber(smallArray, x);
		if(!answer) {
			return false;
		}
		return true;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,3,8,7};
		boolean answer=checkNumber(input,2);
		System.out.println(answer);
		

	}

}
