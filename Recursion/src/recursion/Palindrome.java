package recursion;

public class Palindrome {
	static String s;
	
	public static boolean isStringPalindrome(String input, int startIndex,int endIndex) {
		if(startIndex<input.length()) {
		if(input.length()==1 || input.length()==0) {
			return true;
		}
		
		if(input.charAt(startIndex)!=input.charAt(endIndex)) {
			return false;
			
		}
		
		boolean ans=isStringPalindrome(input, startIndex+1, endIndex-1);
		return ans;
		}
		return true;
	}
	
	public static boolean isStringPalindrome(String input) {
		return isStringPalindrome(input, 0, input.length()-1);	
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pablo";
		boolean ans=isStringPalindrome(s);
		System.out.println(ans);

	}

}
