package recursion;

public class Palindrome {
	static String s;
	
	public static boolean isStringPalindrome(String input) {
		if(input.length()==1) {
			return true;
		}
		
		
		for(int i=1;i<input.length();i++) {
			//s=input.charAt(i);
		}
		return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="r";
		boolean ans=isStringPalindrome(s);
		System.out.println(ans);

	}

}
