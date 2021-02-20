package recursion;

public class CheckSum {
	
	public static int checkSum(int input[]) {
		if(input.length==1) {
			return input[0];
		}
		
		int smallArray[]=new int [input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArray[i-1]=input[i];
			
		}
		return input[0]+checkSum(smallArray);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {9,8,9};
		int answer=checkSum(input);
		System.out.println(answer);
		

	}

}
