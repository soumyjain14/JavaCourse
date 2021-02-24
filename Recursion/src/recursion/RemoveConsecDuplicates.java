package recursion;

public class RemoveConsecDuplicates {
	
	public static String removeConsecutiveDuplicates(String input) {
		if(input.length()<=1) {
			return input;
		}
		if(input.charAt(0)==input.charAt(1)) {
			//String m=Character.toString(input.charAt(0));
			return removeConsecutiveDuplicates(input.substring(1));
			
		}else {
			String m=Character.toString(input.charAt(0));
			String m1=Character.toString(input.charAt(1));
			
			return m+removeConsecutiveDuplicates(input.substring(1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabccba";
		String ans=removeConsecutiveDuplicates(s);
		System.out.println(ans);

	}

}
