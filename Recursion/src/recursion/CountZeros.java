package recursion;

public class CountZeros {
	static int count;
	public static int countZerosRec(int input) {
		
		
		if(input==0) {
			return 1;
		}
		if(input%10==0 && input>=0) {
			count++;
		}
		
		int ans=countZerosRec(input/10);
		
		return count;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=110;
		int ans=countZerosRec(input);
		System.out.println(ans);
		

	}

}
