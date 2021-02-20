package recursion;

public class CheckSorted {
	
	public static boolean checkSorted(int input[]) {
		if(input.length==0 || input.length==1) {
			return true;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArray[i-1]=input[i];
		}
		
		boolean ans=checkSorted(smallArray);
		
		if(!ans) {
			return false;
		}
		if(ans) {
		if(input[0]<=smallArray[0]) {
			return true;
			
		}else {
			return false;
		}
		}
		return false;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,3,6,9};
		boolean answer=checkSorted(input);
		System.out.println(answer);
		

	}

}
