package recursion;

public class SumOfDigits {
	
	public static int sumOfDigits(int input) {
		if(input==0) {
			return 0;
		}
			
		int ans=sumOfDigits(input/10)+(input%10);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=9;
		int ans=sumOfDigits(input);
		System.out.println(ans);

	}

}
